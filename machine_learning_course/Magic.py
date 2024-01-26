import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.preprocessing import StandardScaler

cols = ["fLength", "fWidth", "fSize", "fConcl", "fConcl1", "fAsym", "fM3Long", "fM3Trans", "fAlpha", "fDist", "class"]
df = pd.read_csv("magic04.data", names = cols)

df["class"] = (df["class"] == "g").astype(int)

for label in cols[:-1]:
  plt.hist(df[df["class"]==1][label], color='blue', label='gamma', alpha=0.7, density=True)
  plt.hist(df[df["class"]==0][label], color='red', label='hadron', alpha=0.7, density=True)
  plt.title(label)
  plt.ylabel("Probability")
  plt.xlabel(label)
  plt.legend()
  plt.show()

train, valud, test = np.split(df.sample(frac=1), [int (0.6*len(df)), int(0.8*len(df))])

def scale_dataset(dataframe):
  X = dataframe[dataframe.cols[:-1]].values
  y = dataframe[dataframe.cols[-1]].values

  scaler = StandardScaler()
  X = scaler.fit_transform(X)

  data = np.hstack((X, np.reshape(y, (-1,1))))

  return data, X, y

print(len(train[train["class"]==1]))
print(len(train[train["class"]==0]))
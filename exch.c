void exch(long long int *V, long long int k)
{
  long long int t;

  t      = V[k];
  V[k]   = V[k+1];
  V[k+1] = t;
}

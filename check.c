extern void exch(long long int *V, long long int k);

void check(long long int *V, long long int k)
{
  if (V[k]>V[k+1])
    exch(V,k);
}

      

void bublesort(long long int *V, long long int imax)
{
  long long int i, j, t;

  imax -= 1;
  for (i=0; i<imax; i++)
    for (j=0; j<imax-i; j++)
      {
	if (V[j]>V[j+1])
	  {
	    t = V[j];
	    V[j]=V[j+1];
	    V[j+1]=t;
	  }
      }
}

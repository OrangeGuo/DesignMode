package observemode;

public interface subject {
      public void add(observer observer);
      public void del(observer observer);
      public void notifyobservers();
      public void operation();
}

问题
-
如何使一个实例的方法可以在运行中变化，组合？

分析
-
既然方法要变，我们必须把方法封装成单独的一个类，这些方法用同一个接口管理。然后实例在运行中指向不同的对象，这些对象又分别是不同类的实例。<br />
那么我们必须要用一个父类来管理这些子类，并且父类要含有接口类型的实例。
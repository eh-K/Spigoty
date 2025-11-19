@EventHandler
    public void test1(EntityTargetEvent e)
    {
        Entity creepa = e.getEntity();
        if (creepa instanceof Creeper)
        {
            e.setCancelled(true);
        }
    }

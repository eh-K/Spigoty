// A player throws a trident; we want to recreate the trident and purge the one thrown once.
// ProjectileHitEvent is an Event that occurs when a projectile hits a block or entity.
// Tridents are considered projectiles.
    @EventHandler
    public void playerProjectileHitCheck(ProjectileHitEvent e)
    {
        // we are retrieving the item of the event.
        // this is obv once you understand events.
        Entity thrownTrident = e.getEntity();
        Player playa;
        ItemStack _item;

        
        if (e.getEntity().getShooter() instanceof Player)
        {
            playa = (Player) e.getEntity().getShooter();

            // lets gather all info about the item such as name, enchants, durability, etc.
            _item = ((Trident) thrownTrident).getItem();
            ItemMeta meta = _item.getItemMeta();
            
            // get the inventory of the player, recreate the item with the established metadata
            // then delete the trident that landed initially.
            Inventory _inv = playa.getInventory();
            _item.setItemMeta(meta);
            _inv.addItem(_item);
            thrownTrident.remove();
        }
    }

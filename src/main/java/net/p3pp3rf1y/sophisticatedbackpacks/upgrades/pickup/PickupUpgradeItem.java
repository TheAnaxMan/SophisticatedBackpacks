package net.p3pp3rf1y.sophisticatedbackpacks.upgrades.pickup;

import net.p3pp3rf1y.sophisticatedbackpacks.api.IBackpackUpgradeItem;
import net.p3pp3rf1y.sophisticatedbackpacks.api.UpgradeType;
import net.p3pp3rf1y.sophisticatedbackpacks.items.ItemBase;

public class PickupUpgradeItem extends ItemBase implements IBackpackUpgradeItem<PickupUpgradeWrapper> {
	public static final UpgradeType<PickupUpgradeWrapper> TYPE = new UpgradeType<>(PickupUpgradeWrapper::new);

	private final int filterSlotCount;

	public PickupUpgradeItem() {
		this(9);
	}

	public PickupUpgradeItem(int filterSlotCount) {
		super(new Properties().maxStackSize(1));
		this.filterSlotCount = filterSlotCount;
	}

	public int getFilterSlotCount() {
		return filterSlotCount;
	}

	@Override
	public UpgradeType<PickupUpgradeWrapper> getType() {
		return TYPE;
	}
}

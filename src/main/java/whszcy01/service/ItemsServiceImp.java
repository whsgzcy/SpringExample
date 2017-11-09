package whszcy01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import whszcy01.dao.ItemsMapper;
import whszcy01.model.Items;

@Service("itemsService")
public class ItemsServiceImp implements ItemsServiceI{
	
	private ItemsMapper itemsMapper;
	
	public ItemsMapper getItemsMapper() {
		return itemsMapper;
	}

	@Autowired
	public void setItemsMapper(ItemsMapper itemsMapper) {
		this.itemsMapper = itemsMapper;
	}

	@Override
	public Items getItemById(int id) {
		// TODO Auto-generated method stub
		return itemsMapper.selectByPrimaryKey(id);
	}

}

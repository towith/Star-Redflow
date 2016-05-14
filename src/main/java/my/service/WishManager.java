package my.service;

import my.model.persist.place.Stone;
import my.model.persist.place.Wish;

import java.util.List;

/**
 * Created by niuyinghao on 2016/4/16 for project.
 */
public interface WishManager extends GenericManager<Wish,Long> {
	List<Stone> getStones(Wish wish);
}

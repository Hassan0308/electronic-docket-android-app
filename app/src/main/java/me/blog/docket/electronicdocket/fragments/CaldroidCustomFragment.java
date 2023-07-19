package me.blog.docket.electronicdocket.fragments;

import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidGridAdapter;

import me.blog.docket.electronicdocket.adapters.CaldroidItemAdapter;

public class CaldroidCustomFragment extends CaldroidFragment {

	@Override
	public CaldroidGridAdapter getNewDatesGridAdapter(int month, int year) {
		// TODO Auto-generated method stub
		return new CaldroidItemAdapter(getActivity(), month, year,
				getCaldroidData(), extraData);
	}

}

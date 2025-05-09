package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ListFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INTERNAL_EMPTY_ID = 16711681;
    public static final int INTERNAL_LIST_CONTAINER_ID = 16711683;
    public static final int INTERNAL_PROGRESS_CONTAINER_ID = 16711682;
    public ListAdapter mAdapter;
    public CharSequence mEmptyText;
    public View mEmptyView;
    public ListView mList;
    public View mListContainer;
    public boolean mListShown;
    public View mProgressContainer;
    public TextView mStandardEmptyView;
    private final Handler mHandler = new Handler();
    private final Runnable mRequestFocus = new Runnable() { // from class: androidx.fragment.app.ListFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ListView listView = ListFragment.this.mList;
            listView.focusableViewAvailable(listView);
        }
    };
    private final AdapterView.OnItemClickListener mOnClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.fragment.app.ListFragment.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
            } else {
                ListFragment.this.onListItemClick((ListView) adapterView, view, i, j);
            }
        }
    };

    private void ensureList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d19883", new Object[]{this});
        } else if (this.mList == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.mList = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(INTERNAL_EMPTY_ID);
                    this.mStandardEmptyView = textView;
                    if (textView == null) {
                        this.mEmptyView = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.mProgressContainer = view.findViewById(INTERNAL_PROGRESS_CONTAINER_ID);
                    this.mListContainer = view.findViewById(INTERNAL_LIST_CONTAINER_ID);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.mList = listView;
                        View view2 = this.mEmptyView;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        } else {
                            CharSequence charSequence = this.mEmptyText;
                            if (charSequence != null) {
                                this.mStandardEmptyView.setText(charSequence);
                                this.mList.setEmptyView(this.mStandardEmptyView);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.mListShown = true;
                this.mList.setOnItemClickListener(this.mOnClickListener);
                ListAdapter listAdapter = this.mAdapter;
                if (listAdapter != null) {
                    this.mAdapter = null;
                    setListAdapter(listAdapter);
                } else if (this.mProgressContainer != null) {
                    setListShown(false, false);
                }
                this.mHandler.post(this.mRequestFocus);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public static /* synthetic */ Object ipc$super(ListFragment listFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 462397159) {
            super.onDestroyView();
            return null;
        } else if (hashCode == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/fragment/app/ListFragment");
        }
    }

    public ListAdapter getListAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListAdapter) ipChange.ipc$dispatch("b56bba5d", new Object[]{this});
        }
        return this.mAdapter;
    }

    public ListView getListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListView) ipChange.ipc$dispatch("41d82983", new Object[]{this});
        }
        ensureList();
        return this.mList;
    }

    public long getSelectedItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b8e03fa", new Object[]{this})).longValue();
        }
        ensureList();
        return this.mList.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7d75e07", new Object[]{this})).intValue();
        }
        ensureList();
        return this.mList.getSelectedItemPosition();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(INTERNAL_PROGRESS_CONTAINER_ID);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(INTERNAL_LIST_CONTAINER_ID);
        TextView textView = new TextView(requireContext);
        textView.setId(INTERNAL_EMPTY_ID);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mList = null;
        this.mListShown = false;
        this.mListContainer = null;
        this.mProgressContainer = null;
        this.mEmptyView = null;
        this.mStandardEmptyView = null;
        super.onDestroyView();
    }

    public void onListItemClick(ListView listView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa10f27f", new Object[]{this, listView, view, new Integer(i), new Long(j)});
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        ensureList();
    }

    public final ListAdapter requireListAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListAdapter) ipChange.ipc$dispatch("98a029ac", new Object[]{this});
        }
        ListAdapter listAdapter = getListAdapter();
        if (listAdapter != null) {
            return listAdapter;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void setEmptyText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b55203", new Object[]{this, charSequence});
            return;
        }
        ensureList();
        TextView textView = this.mStandardEmptyView;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.mEmptyText == null) {
                this.mList.setEmptyView(this.mStandardEmptyView);
            }
            this.mEmptyText = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void setListAdapter(ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9ea7f", new Object[]{this, listAdapter});
            return;
        }
        if (this.mAdapter != null) {
            z = true;
        } else {
            z = false;
        }
        this.mAdapter = listAdapter;
        ListView listView = this.mList;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.mListShown && !z) {
                if (requireView().getWindowToken() != null) {
                    z2 = true;
                }
                setListShown(true, z2);
            }
        }
    }

    public void setListShown(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe0d0fc", new Object[]{this, new Boolean(z)});
        } else {
            setListShown(z, true);
        }
    }

    public void setListShownNoAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffb53b", new Object[]{this, new Boolean(z)});
        } else {
            setListShown(z, false);
        }
    }

    public void setSelection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f65a52", new Object[]{this, new Integer(i)});
            return;
        }
        ensureList();
        this.mList.setSelection(i);
    }

    private void setListShown(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3a0158", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        ensureList();
        View view = this.mProgressContainer;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.mListShown != z) {
            this.mListShown = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.mListContainer.clearAnimation();
                }
                this.mProgressContainer.setVisibility(8);
                this.mListContainer.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.mListContainer.clearAnimation();
            }
            this.mProgressContainer.setVisibility(0);
            this.mListContainer.setVisibility(8);
        }
    }
}

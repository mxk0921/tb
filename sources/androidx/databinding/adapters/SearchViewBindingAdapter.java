package androidx.databinding.adapters;

import android.widget.SearchView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SearchViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnQueryTextChange {
        boolean onQueryTextChange(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnSuggestionClick {
        boolean onSuggestionClick(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnSuggestionSelect {
        boolean onSuggestionSelect(int i);
    }

    public static void setOnQueryTextListener(SearchView searchView, final OnQueryTextSubmit onQueryTextSubmit, final OnQueryTextChange onQueryTextChange) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50c00c9c", new Object[]{searchView, onQueryTextSubmit, onQueryTextChange});
        } else if (onQueryTextSubmit == null && onQueryTextChange == null) {
            searchView.setOnQueryTextListener(null);
        } else {
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: androidx.databinding.adapters.SearchViewBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.SearchView.OnQueryTextListener
                public boolean onQueryTextSubmit(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("a6e6eac3", new Object[]{this, str})).booleanValue();
                    }
                    OnQueryTextSubmit onQueryTextSubmit2 = OnQueryTextSubmit.this;
                    if (onQueryTextSubmit2 != null) {
                        return onQueryTextSubmit2.onQueryTextSubmit(str);
                    }
                    return false;
                }

                @Override // android.widget.SearchView.OnQueryTextListener
                public boolean onQueryTextChange(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e2247c5b", new Object[]{this, str})).booleanValue();
                    }
                    OnQueryTextChange onQueryTextChange2 = onQueryTextChange;
                    if (onQueryTextChange2 != null) {
                        return onQueryTextChange2.onQueryTextChange(str);
                    }
                    return false;
                }
            });
        }
    }

    public static void setOnSuggestListener(SearchView searchView, final OnSuggestionSelect onSuggestionSelect, final OnSuggestionClick onSuggestionClick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca21a4c1", new Object[]{searchView, onSuggestionSelect, onSuggestionClick});
        } else if (onSuggestionSelect == null && onSuggestionClick == null) {
            searchView.setOnSuggestionListener(null);
        } else {
            searchView.setOnSuggestionListener(new SearchView.OnSuggestionListener() { // from class: androidx.databinding.adapters.SearchViewBindingAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.SearchView.OnSuggestionListener
                public boolean onSuggestionClick(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7f6a7c7b", new Object[]{this, new Integer(i)})).booleanValue();
                    }
                    OnSuggestionClick onSuggestionClick2 = onSuggestionClick;
                    if (onSuggestionClick2 != null) {
                        return onSuggestionClick2.onSuggestionClick(i);
                    }
                    return false;
                }

                @Override // android.widget.SearchView.OnSuggestionListener
                public boolean onSuggestionSelect(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("6b452ea1", new Object[]{this, new Integer(i)})).booleanValue();
                    }
                    OnSuggestionSelect onSuggestionSelect2 = OnSuggestionSelect.this;
                    if (onSuggestionSelect2 != null) {
                        return onSuggestionSelect2.onSuggestionSelect(i);
                    }
                    return false;
                }
            });
        }
    }
}

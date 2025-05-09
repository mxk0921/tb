package com.etao.feimagesearch.album;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.d22;
import tb.nhi;
import tb.t2o;
import tb.zs9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FolderAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;
    private final List<zs9> mFolders;
    private d22 thumbnailExecutor;
    private final Map<View, nhi> thumbLoaderCaches = new HashMap();
    private int mCurrentSelection = -1;

    static {
        t2o.a(481296462);
    }

    public FolderAdapter(Context context, List<zs9> list, d22 d22Var) {
        this.mContext = context;
        this.mFolders = list;
        this.thumbnailExecutor = d22Var;
    }

    public static /* synthetic */ Object ipc$super(FolderAdapter folderAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/album/FolderAdapter");
    }

    private void refreshView(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73dfd97", new Object[]{this, listView, new Integer(i)});
            return;
        }
        int lastVisiblePosition = listView.getLastVisiblePosition();
        for (int firstVisiblePosition = listView.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition && i != firstVisiblePosition; firstVisiblePosition++) {
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.mFolders.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.feis_album_folder_list_item, (ViewGroup) null, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.folder_list_name);
        TextView textView2 = (TextView) view.findViewById(R.id.folder_list_count);
        TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.folder_list_thumb);
        zs9 item = getItem(i);
        nhi nhiVar = this.thumbLoaderCaches.get(view);
        if (nhiVar == null) {
            nhiVar = new nhi(this.thumbnailExecutor);
            this.thumbLoaderCaches.put(view, nhiVar);
        }
        if (item.j()) {
            nhiVar.a(item.f().get(0), tUrlImageView);
        } else {
            nhiVar.b();
        }
        textView.setText(item.g());
        if (item.k()) {
            this.mCurrentSelection = i;
        }
        if (i == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(item.d());
        }
        return view;
    }

    public void select(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406eed73", new Object[]{this, listView, new Integer(i)});
            return;
        }
        int i2 = this.mCurrentSelection;
        if (i2 != i) {
            if (i2 >= 0) {
                getItem(i2).l(false);
            }
            getItem(i).l(true);
            this.mCurrentSelection = i;
        }
    }

    @Override // android.widget.Adapter
    public zs9 getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (zs9) ipChange.ipc$dispatch("4bd6b694", new Object[]{this, new Integer(i)}) : this.mFolders.get(i);
    }
}

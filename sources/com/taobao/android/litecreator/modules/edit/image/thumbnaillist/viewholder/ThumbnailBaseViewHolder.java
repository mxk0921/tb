package com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailItem;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter;
import com.taobao.schedule.ViewProxy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class ThumbnailBaseViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public c f8290a;
    public d b;
    public ThumbnailItem c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            c cVar = ThumbnailBaseViewHolder.this.f8290a;
            if (cVar != null) {
                ((ThumbnailListAdapter.g) cVar).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            d dVar = ThumbnailBaseViewHolder.this.b;
            if (dVar != null) {
                ((ThumbnailListAdapter.h) dVar).a();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    static {
        t2o.a(511705270);
    }

    public ThumbnailBaseViewHolder(View view) {
        super(view);
    }

    public static /* synthetic */ Object ipc$super(ThumbnailBaseViewHolder thumbnailBaseViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/viewholder/ThumbnailBaseViewHolder");
    }

    public void b0(ThumbnailItem thumbnailItem, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8179e15c", new Object[]{this, thumbnailItem, new Integer(i), new Boolean(z)});
            return;
        }
        this.c = thumbnailItem;
        ViewProxy.setOnClickListener(this.itemView, new a());
        ViewProxy.setOnLongClickListener(this.itemView, new b());
    }

    public String c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6550f922", new Object[]{this});
        }
        return this.c.typeTag;
    }

    public void d0(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8fb476", new Object[]{this, cVar});
        } else {
            this.f8290a = cVar;
        }
    }

    public void e0(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c233ef6", new Object[]{this, dVar});
        } else {
            this.b = dVar;
        }
    }
}

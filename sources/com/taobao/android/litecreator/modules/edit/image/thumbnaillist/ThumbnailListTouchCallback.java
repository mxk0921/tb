package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder.ThumbnailMediaViewHolder;
import com.taobao.android.litecreator.widgets.SelectedItemTouchCallback;
import tb.odg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThumbnailListTouchCallback extends SelectedItemTouchCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8285a = true;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(511705258);
    }

    public static /* synthetic */ Object ipc$super(ThumbnailListTouchCallback thumbnailListTouchCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -596902942) {
            super.clearView((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]);
            return null;
        } else if (hashCode == 1619420421) {
            return new Integer(super.getMovementFlags((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/ThumbnailListTouchCallback");
        }
    }

    @Override // com.taobao.android.litecreator.widgets.SelectedItemTouchCallback
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b6d866", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.litecreator.widgets.SelectedItemTouchCallback
    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461ab9ac", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            ((ThumbnailListAdapter.d) aVar).b(i, i2);
        }
    }

    public final boolean c(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fc9f86e", new Object[]{this, viewHolder})).booleanValue();
        }
        if (this.b == null || !TextUtils.equals(((ThumbnailMediaViewHolder) viewHolder).c0(), ((ThumbnailListAdapter.d) this.b).a())) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.litecreator.widgets.SelectedItemTouchCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6bfbe2", new Object[]{this, recyclerView, viewHolder});
            return;
        }
        super.clearView(recyclerView, viewHolder);
        int adapterPosition = viewHolder.getAdapterPosition();
        int layoutPosition = viewHolder.getLayoutPosition();
        odg.b("BuyerShowItemTouchHelperCallback", "aYou thumbnail getAdapterPosition = " + adapterPosition + " ,getLayoutPosition= " + layoutPosition);
        a aVar = this.b;
        if (aVar != null) {
            ((ThumbnailListAdapter.d) aVar).c(adapterPosition);
        }
    }

    public final boolean d(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9633621", new Object[]{this, viewHolder})).booleanValue();
        }
        if (!(viewHolder instanceof ThumbnailMediaViewHolder) || c(viewHolder)) {
            return false;
        }
        return true;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f6a11", new Object[]{this, new Boolean(z)});
        } else {
            this.f8285a = z;
        }
    }

    public void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7237d174", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // com.taobao.android.litecreator.widgets.SelectedItemTouchCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60866505", new Object[]{this, recyclerView, viewHolder})).intValue();
        }
        e(d(viewHolder));
        return super.getMovementFlags(recyclerView, viewHolder);
    }

    @Override // com.taobao.android.litecreator.widgets.SelectedItemTouchCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue();
        }
        return this.f8285a;
    }

    @Override // com.taobao.android.litecreator.widgets.SelectedItemTouchCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec6018c", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
        }
        if (!d(viewHolder) || !d(viewHolder2)) {
            return false;
        }
        return true;
    }
}

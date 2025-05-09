package com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailItem;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThumbnailPlaceholderViewHolder extends ThumbnailBaseViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705277);
    }

    public ThumbnailPlaceholderViewHolder(View view) {
        super(view);
    }

    public static /* synthetic */ Object ipc$super(ThumbnailPlaceholderViewHolder thumbnailPlaceholderViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -2122718884) {
            super.b0((ThumbnailItem) objArr[0], ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/viewholder/ThumbnailPlaceholderViewHolder");
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder.ThumbnailBaseViewHolder
    public void b0(ThumbnailItem thumbnailItem, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8179e15c", new Object[]{this, thumbnailItem, new Integer(i), new Boolean(z)});
            return;
        }
        super.b0(thumbnailItem, i, z);
        this.itemView.setClickable(false);
        this.itemView.setLongClickable(false);
        this.itemView.setBackgroundColor(0);
    }
}

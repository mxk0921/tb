package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.pg1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "record", "(Landroid/graphics/Picture;IILtb/g1a;)Landroid/graphics/Picture;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class PictureKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Picture record(Picture picture, int i, int i2, g1a<? super Canvas, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Picture) ipChange.ipc$dispatch("91d9b0b8", new Object[]{picture, new Integer(i), new Integer(i2), g1aVar});
        }
        try {
            g1aVar.invoke(picture.beginRecording(i, i2));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}

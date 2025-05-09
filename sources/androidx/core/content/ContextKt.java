package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.sync.IndexUpdateHandler;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.pg1;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aU\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"", "T", "Landroid/content/Context;", "getSystemService", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Ltb/xhv;", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "withStyledAttributes", "(Landroid/content/Context;Landroid/util/AttributeSet;[IIILtb/g1a;)V", IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, "(Landroid/content/Context;I[ILtb/g1a;)V", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ContextKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final /* synthetic */ <T> T getSystemService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f0b37a01", new Object[]{context});
        }
        ckf.m(4, "T");
        throw null;
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, g1a<? super TypedArray, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8af0f1", new Object[]{context, attributeSet, iArr, new Integer(i), new Integer(i2), g1aVar});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        g1aVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, g1a g1aVar, int i3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15040051", new Object[]{context, attributeSet, iArr, new Integer(i), new Integer(i2), g1aVar, new Integer(i3), obj});
            return;
        }
        if ((i3 & 1) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        g1aVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(Context context, int i, int[] iArr, g1a<? super TypedArray, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17eef9c6", new Object[]{context, new Integer(i), iArr, g1aVar});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        g1aVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}

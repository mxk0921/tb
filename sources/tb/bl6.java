package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bl6 extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXVIEW_DOWNGRADEUNKNOWNLAYOUT = 4719561797427227199L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16461a = false;

    static {
        t2o.a(444597418);
    }

    public bl6() {
        setVisibility(2);
    }

    public static /* synthetic */ Object ipc$super(bl6 bl6Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXUnKnownNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        this.f16461a = ((bl6) dXWidgetNode).f16461a;
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (DXVIEW_DOWNGRADEUNKNOWNLAYOUT == j) {
            if (i != 1) {
                z = false;
            }
            this.f16461a = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93109f74", new Object[]{this})).booleanValue();
        }
        return this.f16461a;
    }
}

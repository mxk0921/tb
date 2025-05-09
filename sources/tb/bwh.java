package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bwh extends UIImageDrawable implements xdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float p = o4p.L();

    static {
        t2o.a(815792727);
        t2o.a(815792722);
    }

    public static /* synthetic */ Object ipc$super(bwh bwhVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -62336886) {
            return new Integer(super.getWidth());
        }
        if (hashCode == 1191436823) {
            return new Integer(super.getHeight());
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/img/MUSImageDrawable");
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da5990a", new Object[]{this});
        } else {
            this.p = 1.0f;
        }
    }

    @Override // tb.xdc
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dc6f606", new Object[]{this})).intValue();
        }
        return super.getHeight();
    }

    @Override // tb.xdc
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89ec02bb", new Object[]{this})).intValue();
        }
        return super.getWidth();
    }

    @Override // com.taobao.android.weex_uikit.widget.img.UIImageDrawable, tb.hpc.a
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return (int) (super.getHeight() * this.p);
    }

    @Override // com.taobao.android.weex_uikit.widget.img.UIImageDrawable, tb.hpc.a
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return (int) (super.getWidth() * this.p);
    }
}

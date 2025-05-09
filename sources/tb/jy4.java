package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Crop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jy4 extends hu1<Crop> implements prb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705463);
        t2o.a(511705353);
    }

    public static /* synthetic */ Object ipc$super(jy4 jy4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/CropEditorImpl");
    }

    @Override // tb.prb
    public void k0(Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a0d03c", new Object[]{this, crop});
            return;
        }
        t();
        g().b(crop);
    }

    @Override // tb.prb
    public Crop n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Crop) ipChange.ipc$dispatch("a88af100", new Object[]{this});
        }
        return g().a().get();
    }
}

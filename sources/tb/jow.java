package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Volume;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jow extends hu1<Volume> implements sae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705472);
        t2o.a(511705374);
    }

    public static /* synthetic */ Object ipc$super(jow jowVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/VolumeEditorImpl");
    }

    @Override // tb.sae
    public Volume getVolume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Volume) ipChange.ipc$dispatch("ece212b2", new Object[]{this});
        }
        return g().a().get();
    }

    @Override // tb.sae
    public void w(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f428c28", new Object[]{this, volume});
            return;
        }
        t();
        g().b(volume.clone());
    }
}

package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Music;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vcj extends hu1<Music> implements fxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705468);
        t2o.a(511705362);
    }

    public static /* synthetic */ Object ipc$super(vcj vcjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/MusicEditorImpl");
    }

    @Override // tb.fxc
    public void S(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df83c290", new Object[]{this, music});
            return;
        }
        t();
        g().b(music.clone());
    }

    @Override // tb.fxc
    public Music W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Music) ipChange.ipc$dispatch("7b827cc6", new Object[]{this});
        }
        return g().a().get();
    }

    @Override // tb.fxc
    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31f085f", new Object[]{this});
            return;
        }
        t();
        g().b(null);
    }
}

package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Sticker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wmq extends hu1<Sticker> implements xsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705470);
        t2o.a(511705366);
    }

    public static /* synthetic */ Object ipc$super(wmq wmqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/impl/StickerEditorImpl");
    }

    @Override // tb.xsd
    public Sticker d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sticker) ipChange.ipc$dispatch("cf7b9116", new Object[]{this});
        }
        return g().a().get();
    }
}

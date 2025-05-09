package tb;

import android.text.TextUtils;
import com.alibaba.marvel.MeEditor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f31131a = new ArrayList();
    public MeEditor b;

    static {
        t2o.a(511705104);
    }

    public void c(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0180f6", new Object[]{this, meEditor});
        } else {
            this.b = meEditor;
        }
    }

    public void d(AiQuality aiQuality, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2996fd41", new Object[]{this, aiQuality, list});
            return;
        }
        this.f31131a = list;
        if (aiQuality == null || !aiQuality.enable) {
            b();
        } else if (!TextUtils.isEmpty(aiQuality.dirPath) && aiQuality.enable) {
            a(aiQuality);
        }
    }

    public final void a(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c623e3c4", new Object[]{this, aiQuality});
        } else if (this.b == null) {
            odg.c("AIQualityMarvelHelper", "mNewEditor == null");
        } else {
            String str = aiQuality.dirPath;
            if (!cg9.l(str)) {
                odg.c("AIQualityMarvelHelper", "ai quality dirPath not exist " + str);
            }
            for (String str2 : this.f31131a) {
                this.b.addExtentionEffectForClip(str2, str, AiQuality.QUALITY_KEY, 1L);
            }
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a27f71", new Object[]{this});
        } else if (this.b == null) {
            odg.c("AIQualityMarvelHelper", "mNewEditor == null");
        } else {
            for (String str : this.f31131a) {
                this.b.removeExtensionEffectFromClip(str, AiQuality.QUALITY_KEY);
            }
        }
    }
}

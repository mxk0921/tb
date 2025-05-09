package tb;

import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.java.SourceType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iie {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MeEditor b;
    public Adjust c;
    public String e;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f21325a = new ArrayList();
    public boolean d = false;

    static {
        t2o.a(511705466);
    }

    public void b(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0180f6", new Object[]{this, meEditor});
        } else {
            this.b = meEditor;
        }
    }

    public void c(Adjust adjust, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1641deef", new Object[]{this, adjust, list});
            return;
        }
        this.f21325a = list;
        this.c = adjust;
        if (adjust != null) {
            a(adjust);
        }
    }

    public final void a(Adjust adjust) {
        Map<String, Float> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89248872", new Object[]{this, adjust});
        } else if (this.b == null) {
            odg.c("ImageAdjustImpl", "mNewEditor == null");
        } else {
            String str = adjust.mDirPath;
            if (!cg9.l(str)) {
                odg.c("ImageAdjustImpl", "adjust dirPath not exist " + str);
                return;
            }
            if (!this.d) {
                if (this.f21325a.size() == 1) {
                    this.d = this.b.addExtentionEffectForClip(this.f21325a.get(0), str, Adjust.IMAGE_ADJUST_KEY, 1L) == 0;
                    this.e = this.f21325a.get(0);
                } else {
                    this.e = this.b.addExtensionClip("", str, 0L, (long) ale.IMAGE_CLIP_DURATION_US, Adjust.IMAGE_ADJUST_KEY, SourceType.kSourceTexture, 1L);
                    this.d = true;
                }
            }
            if (this.d && (map = this.c.mParamsValues) != null && !map.isEmpty()) {
                Adjust adjust2 = this.c;
                if (adjust2.mDirtyType == 2) {
                    for (String str2 : adjust2.mParamsValues.keySet()) {
                        this.b.getCoreEditor().setProperty(this.e, Adjust.IMAGE_ADJUST_KEY, str2, this.c.mParamsValues.get(str2).floatValue());
                    }
                    return;
                }
                String str3 = adjust2.mSingleKey;
                Float f = adjust2.mParamsValues.get(str3);
                if (f != null) {
                    odg.d("ImageAdjustImpl", "adjust key = " + str3 + ",value = " + f);
                    this.b.getCoreEditor().setProperty(this.e, Adjust.IMAGE_ADJUST_KEY, str3, (double) f.floatValue());
                }
            }
        }
    }
}

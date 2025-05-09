package com.alibaba.poplayer.info.frequency;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.info.frequency.SceneFreqConfigModel;
import com.alibaba.poplayer.norm.ISceneFreqAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.jd0;
import tb.lto;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f2522a = new AtomicBoolean(false);
    public List<SceneFreqConfigModel> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends TypeReference<List<SceneFreqConfigModel>> {
        public a(b bVar) {
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.poplayer.info.frequency.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class C0091b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final b f2523a = new b();

        static {
            t2o.a(625999932);
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("54c5b4bf", new Object[0]);
            }
            return f2523a;
        }
    }

    static {
        t2o.a(625999930);
    }

    public static SceneFreqConfigModel c(String str, String str2, List<SceneFreqConfigModel> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SceneFreqConfigModel) ipChange.ipc$dispatch("da6e8d97", new Object[]{str, str2, list});
        }
        for (SceneFreqConfigModel sceneFreqConfigModel : list) {
            if (sceneFreqConfigModel != null) {
                Iterator<String> it = sceneFreqConfigModel.uris.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.equals(it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z = lto.a(str2, sceneFreqConfigModel.filter);
                }
                if (z) {
                    return sceneFreqConfigModel;
                }
            }
        }
        return null;
    }

    public static b e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3c78a2ba", new Object[0]);
        }
        return C0091b.a();
    }

    public void b(String str, String str2, String str3) {
        String str4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4143f294", new Object[]{this, str, str2, str3});
        } else if (!TextUtils.isEmpty(str)) {
            List<SceneFreqConfigModel> d = d();
            wdm.d("SceneFreqManager.countTireFreq.configs=" + d, new Object[0]);
            if (!(d == null || d.isEmpty())) {
                SceneFreqConfigModel c = c(str, str2, d);
                StringBuilder sb = new StringBuilder("SceneFreqManager.countTireFreq.hitConfig=");
                if (c == null) {
                    z = false;
                }
                sb.append(z);
                wdm.d(sb.toString(), new Object[0]);
                if (c != null) {
                    for (SceneFreqConfigModel.FreqConfig freqConfig : c.freq) {
                        if (!(freqConfig == null || (str4 = freqConfig.layer) == null || !str4.equals(str3))) {
                            freqConfig.lastRecordTime = Long.valueOf(System.currentTimeMillis());
                            wdm.d("SceneFreqManager.countTireFreq.lastRecordTime=" + freqConfig.lastRecordTime + ".layer=" + freqConfig.layer, new Object[0]);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final List<SceneFreqConfigModel> d() {
        ISceneFreqAdapter b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fdea6dd", new Object[]{this});
        }
        if (this.f2522a.compareAndSet(false, true) && (b = jd0.c().b()) != null) {
            String sceneFreqConfig = b.getSceneFreqConfig();
            if (!TextUtils.isEmpty(sceneFreqConfig)) {
                try {
                    this.b = new CopyOnWriteArrayList((Collection) JSON.parseObject(sceneFreqConfig, new a(this), new Feature[0]));
                } catch (Throwable th) {
                    wdm.h("SceneFreqManager.parse.error", th);
                }
            }
        }
        wdm.d("SceneFreqManager.getSceneFreqConfigs=" + this.b, new Object[0]);
        return this.b;
    }

    public boolean a(String str, String str2, String str3) {
        List<SceneFreqConfigModel> d;
        SceneFreqConfigModel c;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7181ec9", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (d = d()) == null || d.isEmpty() || (c = c(str, str2, d)) == null) {
            return true;
        }
        for (SceneFreqConfigModel.FreqConfig freqConfig : c.freq) {
            if (freqConfig != null && ((TextUtils.isEmpty(freqConfig.layer) && TextUtils.isEmpty(str3)) || freqConfig.layer.equals(str3))) {
                Long l = freqConfig.lastRecordTime;
                if (l == null || l.longValue() <= 0) {
                    wdm.d("SceneFreqManager.checkFreq.layer=" + str3 + "noLastRecordTime.pass=true", new Object[0]);
                    return true;
                }
                long currentTimeMillis = (System.currentTimeMillis() - freqConfig.lastRecordTime.longValue()) / 1000;
                if (currentTimeMillis <= freqConfig.interval.intValue()) {
                    z = false;
                }
                wdm.d("SceneFreqManager.checkFreq.layer=" + str3 + ".lastRecordTime=" + freqConfig.lastRecordTime + ".curInterval=" + currentTimeMillis + ".interval=" + freqConfig.interval + ".pass=" + z, new Object[0]);
                return z;
            }
        }
        return true;
    }
}

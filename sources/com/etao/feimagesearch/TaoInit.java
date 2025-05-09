package com.etao.feimagesearch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.TaoInit;
import com.etao.feimagesearch.capture.CaptureActivity;
import com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager;
import com.etao.feimagesearch.jni.PailitaoCUtil;
import com.etao.feimagesearch.mnn.AdvanceAutoDetectObjectUnit;
import com.etao.feimagesearch.mnn.PltMnnBucketManager;
import com.etao.feimagesearch.mnn.autodetect.SmartAutoDetectObjectUnit;
import com.etao.feimagesearch.mnn.channel.ChannelDetectUnit;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.nn.MNNManager;
import com.taobao.android.weex.b;
import com.taobao.search.common.SearchSdk;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.ut.device.UTDevice;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import tb.caa;
import tb.d5x;
import tb.e0;
import tb.eyw;
import tb.fk0;
import tb.jzu;
import tb.lg4;
import tb.m2s;
import tb.nmj;
import tb.oen;
import tb.q7m;
import tb.qc0;
import tb.t2o;
import tb.tts$e;
import tb.tts$f;
import tb.tts$g;
import tb.tts$h;
import tb.tts$i;
import tb.wyn;
import tb.yr3;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TaoInit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALBUM_URL = "http://h5.m.taobao.com/tusou/album/index.html";
    private static volatile boolean sInitFlag = false;
    private static volatile boolean sRainbowInit = false;
    private static volatile boolean sMnnManagerInit = false;

    static {
        t2o.a(730857492);
    }

    public static /* synthetic */ void access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5552fbc", new Object[0]);
        } else {
            doMnnPreloadTask();
        }
    }

    public static /* synthetic */ String[] access$600(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a75d4e51", new Object[]{strArr});
        }
        return addRainbowIfAbsent(strArr);
    }

    public static /* synthetic */ String[] access$700(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6a49b7b0", new Object[]{strArr});
        }
        return addShowRainbowIfAbsent(strArr);
    }

    private static void doMnnPreloadTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54aabdf3", new Object[0]);
            return;
        }
        final boolean r = lg4.r();
        final boolean X = lg4.X();
        if (r || X) {
            MNNManager.Companion.a().j("", new MNNManager.b() { // from class: tb.tts$d
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.nn.MNNManager.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("be56d7bc", new Object[]{this});
                        return;
                    }
                    if (r) {
                        AdvanceAutoDetectObjectUnit.Companion.a().D();
                        SmartAutoDetectObjectUnit.Companion.a().D();
                    }
                    if (X) {
                        ChannelDetectUnit.Companion.a().D();
                    }
                }
            });
        }
    }

    public static boolean hasInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[0])).booleanValue();
        }
        return sInitFlag;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!sInitFlag) {
            if (lg4.A()) {
                q7m.a(new zio() { // from class: tb.tts$a
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(tts$a tts_a, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/TaoInit$1");
                    }

                    @Override // tb.zio
                    public void c() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("15c1193f", new Object[]{this});
                        } else {
                            TaoInit.loadXSearchSync();
                        }
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } else {
                loadXSearchSync();
            }
            caa.v(new tts$g());
            e0.f(new tts$e());
            b.d().i(caa.c(), new d5x.a() { // from class: tb.tts$b
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.d5x.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2eae6f25", new Object[]{this});
                    }
                }
            });
            qc0.b(new tts$f());
            eyw.c(new m2s());
            jzu.o(new tts$i(null));
            nmj.b(new tts$h());
            fk0.sActivityClass = CaptureActivity.class;
            yr3.sActivityClass = CaptureActivity.class;
            IrpParamModel.sActivityClass = IrpActivity.class;
            initRainbow();
            initMnnManager();
            sInitFlag = true;
        }
    }

    private static void initMnnManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51965b7", new Object[0]);
        } else if (!sMnnManagerInit) {
            sMnnManagerInit = true;
            final boolean e4 = lg4.e4();
            q7m.a(new zio() { // from class: tb.tts$c
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(tts$c tts_c, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/TaoInit$3");
                }

                @Override // tb.zio
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("15c1193f", new Object[]{this});
                        return;
                    }
                    PltTemplatesManager.h();
                    if (!PailitaoCUtil.f()) {
                        PailitaoCUtil.g();
                    }
                    if (!e4) {
                        MNNManager.Companion.a().h();
                    }
                    PltMnnBucketManager.Companion.a().d();
                    TaoInit.access$500();
                }
            }, lg4.Z2(), TimeUnit.MILLISECONDS);
            if (e4) {
                MNNManager.Companion.a().h();
            }
            if (lg4.w0()) {
                wyn.INSTANCE.g();
            }
        }
    }

    private static void initRainbow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09ecc0d", new Object[0]);
        } else if (!sRainbowInit) {
            try {
                oen.p(TaoApplication.getVersion(), UTDevice.getUtdid(Globals.getApplication()), Globals.getApplication());
                oen.z();
                sRainbowInit = true;
            } catch (Exception unused) {
            }
        }
    }

    public static void loadXSearchSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ece03c", new Object[0]);
            return;
        }
        try {
            SearchSdk.init();
        } catch (Exception unused) {
        }
    }

    private static String[] addRainbowIfAbsent(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("48159bbc", new Object[]{strArr});
        }
        if (!hasRainbow(strArr)) {
            if (strArr == null) {
                strArr = new String[1];
            } else {
                String[] strArr2 = new String[strArr.length + 1];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 1] = "rainbow=" + URLEncoder.encode(oen.j());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    private static String[] addShowRainbowIfAbsent(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("902d3759", new Object[]{strArr});
        }
        if (!hasRainbow(strArr)) {
            if (strArr == null) {
                strArr = new String[2];
            } else {
                String[] strArr2 = new String[strArr.length + 2];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            try {
                strArr[strArr.length - 2] = "rainbow";
                strArr[strArr.length - 1] = URLEncoder.encode(oen.j());
            } catch (Exception unused) {
            }
        }
        return strArr;
    }

    private static boolean hasRainbow(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("159c3c00", new Object[]{strArr})).booleanValue();
        }
        if (!(strArr == null || strArr.length == 0)) {
            for (String str : strArr) {
                if (str != null && str.contains("rainbow")) {
                    return true;
                }
            }
        }
        return false;
    }
}

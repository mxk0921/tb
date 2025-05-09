package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.client.smart.core.core.WukongNativeManager;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.alibaba.security.wukong.config.Algo;
import com.alibaba.security.wukong.model.AudioSample;
import com.alibaba.security.wukong.model.ByteImageSample;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.model.ImageRiskSample;
import com.alibaba.security.wukong.model.TextRiskSample;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.utils.a;
import com.taobao.android.mnncv.MNNCV;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.android.mnncv.MNNCVImage;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.oqh;
import tb.pg1;
import tb.vbm;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.jb  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class AbstractC1172jb extends V implements mb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2600a = "AbsMNNCVExecutor";
    public final Context b;
    public final String c;
    public final AbstractC1157eb d;
    public final boolean e;
    public final Algo f;
    public final MNNCVExecutor g;
    public long h;
    public long i;
    public volatile boolean j;
    public String k;
    public final int l;

    public AbstractC1172jb(Context context, Algo algo, AbstractC1157eb ebVar) {
        this.b = context;
        this.f = algo;
        this.d = ebVar;
        String str = algo.code;
        this.c = str;
        this.e = algo.preRun;
        MRTTaskDescription e = oqh.d().e(str);
        if (e != null) {
            this.k = e.cid;
        }
        this.g = new MNNCVExecutor(str);
        this.l = vb.c().j();
    }

    private int d(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a5254c1", new Object[]{this, imageRiskSample})).intValue() : imageRiskSample.getWidth();
    }

    public static /* synthetic */ Object ipc$super(AbstractC1172jb jbVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/jb");
    }

    private void resetDetectData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eddba23", new Object[]{this});
            return;
        }
        this.h = 0L;
        this.i = 0L;
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public String algoCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf0c4019", new Object[]{this});
        }
        return e();
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : MNNCV.isTaskRunnable(this.c);
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
    }

    public abstract String d();

    @Override // com.alibaba.security.ccrc.service.build.mb
    public Map<String, Object> detect(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("928a82f8", new Object[]{this, cCRCRiskSample});
        }
        return b(cCRCRiskSample);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.security.ccrc.service.build.V
    public boolean loggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19954f88", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        MNNCVExecutor mNNCVExecutor = this.g;
        if (mNNCVExecutor != null) {
            mNNCVExecutor.e();
            this.j = false;
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.V
    public String type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "python";
    }

    public static /* synthetic */ void a(AbstractC1172jb jbVar, String str, String str2, String str3, String str4, boolean z, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d4a62", new Object[]{jbVar, str, str2, str3, str4, new Boolean(z), str5});
        } else {
            jbVar.reportAlgoInitEnd(str, str2, str3, str4, z, str5);
        }
    }

    private void b(String str, AbstractC1151cb cbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cc4798", new Object[]{this, str, cbVar});
            return;
        }
        try {
            resetDetectData();
            if (this.j) {
                cbVar.a(true, "");
                if (this.d != null && !TextUtils.isEmpty(d())) {
                    this.d.a(d(), false);
                    return;
                }
                return;
            }
            this.j = false;
            this.g.g(new C1166hb(this, str, cbVar));
        } catch (Exception e) {
            reportAlgoInitEnd(str, this.d.getCcrcCode(), this.c, Log.getStackTraceString(e), false, this.k);
        }
    }

    private int c(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("191c01e2", new Object[]{this, imageRiskSample})).intValue() : imageRiskSample.getHeight();
    }

    private MNNCVImage e(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MNNCVImage) ipChange.ipc$dispatch("68bb66a1", new Object[]{this, imageRiskSample}) : imageRiskSample.toMNNCVImage();
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public void a(String str, AbstractC1151cb cbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0acbd7", new Object[]{this, str, cbVar});
        } else if (!b()) {
            cbVar.a(false, "task is not runnable");
        } else {
            this.mAlgoInitTime = System.currentTimeMillis();
            b(str, cbVar);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public void a(AbstractC1148bb bbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbdb8c", new Object[]{this, bbVar});
        } else if (!b()) {
            bbVar.a(false, "task is not runnable");
        } else {
            this.g.f(new C1163gb(this, bbVar));
        }
    }

    private ByteImageSample a(ByteImageSample byteImageSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteImageSample) ipChange.ipc$dispatch("a90b6e28", new Object[]{this, byteImageSample});
        }
        if (byteImageSample.getFormat() != 2) {
            return byteImageSample;
        }
        ByteImageSample byteImageSample2 = new ByteImageSample(byteImageSample.getMetaId(), WukongNativeManager.c().a(byteImageSample.getData(), byteImageSample.getWidth(), byteImageSample.getHeight(), 5), byteImageSample.getWidth(), byteImageSample.getHeight(), 5);
        byteImageSample2.setExtras(byteImageSample.getExtras());
        return byteImageSample2;
    }

    private Map<String, Object> b(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("161ded37", new Object[]{this, cCRCRiskSample});
        }
        if (cCRCRiskSample instanceof ByteImageSample) {
            cCRCRiskSample = a((ByteImageSample) cCRCRiskSample);
        }
        long currentTimeMillis = System.currentTimeMillis();
        nb a2 = a(cCRCRiskSample);
        if (!a2.d()) {
            Logging.e(f2600a, "detect fail ", a2.f2609a);
        }
        reportAlgoDetectEnd(cCRCRiskSample, this.d.d(), this.d.getCcrcCode(), this.c, a2.c(), System.currentTimeMillis() - currentTimeMillis, a2.d(), a2.b(), this.k, this.d.b());
        return a2.a();
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.k;
    }

    private nb a(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb) ipChange.ipc$dispatch("b44cdbe5", new Object[]{this, cCRCRiskSample});
        }
        if (cCRCRiskSample instanceof ImageRiskSample) {
            return a((ImageRiskSample) cCRCRiskSample);
        }
        if (cCRCRiskSample instanceof TextRiskSample) {
            return a((TextRiskSample) cCRCRiskSample);
        }
        if (cCRCRiskSample instanceof AudioSample) {
            return a((AudioSample) cCRCRiskSample);
        }
        if (cCRCRiskSample instanceof BehaviorRiskSample) {
            return a((BehaviorRiskSample) cCRCRiskSample);
        }
        return new nb(new IllegalStateException("样本不支持Python"));
    }

    private int b(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17e5af03", new Object[]{this, imageRiskSample})).intValue() : imageRiskSample.getMNNCVImageFormat();
    }

    private nb a(BehaviorRiskSample behaviorRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb) ipChange.ipc$dispatch("4cc4468", new Object[]{this, behaviorRiskSample});
        }
        if (this.g == null) {
            return new nb(new IllegalStateException("算法未初始化"));
        }
        this.h++;
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("text", JsonUtils.toJSONString(behaviorRiskSample.getRawData()));
        Map<String, Object> extras = behaviorRiskSample.getExtras();
        if (extras != null) {
            hashMap.putAll(extras);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("dataType", "Behavior");
        hashMap2.put("inputData", hashMap);
        return a(hashMap2, currentTimeMillis);
    }

    private nb a(AudioSample audioSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb) ipChange.ipc$dispatch("df80f81", new Object[]{this, audioSample});
        }
        if (this.g == null) {
            return new nb(new IllegalStateException("算法未初始化"));
        }
        this.h++;
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("audio", audioSample.toMNNAudioData());
        Map<String, Object> extras = audioSample.getExtras();
        if (extras != null) {
            hashMap.putAll(extras);
        }
        hashMap.put(pg1.ATOM_length, Integer.valueOf(audioSample.getLength()));
        hashMap.put("sampleRate", Integer.valueOf(audioSample.getAudioSampleConfig().getSampleRate()));
        hashMap.put("channel", Integer.valueOf(audioSample.getAudioSampleConfig().getChannel()));
        hashMap.put("format", Integer.valueOf(audioSample.getAudioSampleConfig().getAudioFormat().value));
        hashMap.put("bitWidth", Integer.valueOf(audioSample.getAudioSampleConfig().getBitWidth().value));
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("dataType", "Audio");
        hashMap2.put("inputData", hashMap);
        return a(hashMap2, currentTimeMillis);
    }

    private nb a(TextRiskSample textRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb) ipChange.ipc$dispatch("6f39b6a1", new Object[]{this, textRiskSample});
        }
        if (this.g == null) {
            return new nb(new IllegalStateException("算法未初始化"));
        }
        this.h++;
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("text", textRiskSample.getText().getContent());
        Map<String, Object> extras = textRiskSample.getExtras();
        if (extras != null) {
            hashMap.putAll(extras);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("dataType", vbm.TYPE_TEXT);
        hashMap2.put("inputData", hashMap);
        return a(hashMap2, currentTimeMillis);
    }

    private nb a(HashMap<String, Object> hashMap, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb) ipChange.ipc$dispatch("6a49fa4d", new Object[]{this, hashMap, new Long(j)});
        }
        nb a2 = a(hashMap);
        this.i = (System.currentTimeMillis() - j) + this.i;
        this.d.a(algoCode());
        return a2;
    }

    private nb a(ImageRiskSample imageRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb) ipChange.ipc$dispatch("1eec1af5", new Object[]{this, imageRiskSample});
        }
        if (this.g == null) {
            return new nb(new IllegalStateException("算法未初始化"));
        }
        this.h++;
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(a.KEY_IMAGE, imageRiskSample.toMNNCVImage());
        hashMap.put(a.KEY_FORMAT, Integer.valueOf(imageRiskSample.getMNNCVImageFormat()));
        hashMap.put(a.KEY_IMAGE_WIDTH, Integer.valueOf(imageRiskSample.getWidth()));
        hashMap.put(a.KEY_IMAGE_HEIGHT, Integer.valueOf(imageRiskSample.getHeight()));
        Map<String, Object> extras = imageRiskSample.getExtras();
        if (extras != null) {
            hashMap.putAll(extras);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("dataType", "videoFrame");
        hashMap2.put("inputData", hashMap);
        return a(hashMap2, currentTimeMillis);
    }

    public nb a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb) ipChange.ipc$dispatch("ec8b6989", new Object[]{this, map});
        }
        nb nbVar = new nb(new RuntimeException("mnn process time out 10s"));
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.g.j(map, new C1169ib(this, nbVar, countDownLatch));
        try {
            countDownLatch.await(this.l, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logging.w(f2600a, e.getMessage());
        }
        return nbVar;
    }

    @Override // com.alibaba.security.ccrc.service.build.mb
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f.isSupport(str);
    }
}

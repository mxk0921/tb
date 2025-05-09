package tb;

import android.app.Application;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q2s extends Coordinator.TaggedRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILE_NAME = "taolivegoodspage";
    public static final String FILE_NAME2 = "taolivegoodspage2";
    public static final String JSON = ".json";
    public static final String TAG = "TLGoodsIdle";
    public static final String TASK_NAME = "TLGoodsPreload";

    /* renamed from: a  reason: collision with root package name */
    private final Application f26469a;
    private String b = FILE_NAME;
    private String c = FILE_NAME2;

    static {
        t2o.a(806355558);
    }

    public q2s(Application application) {
        super(TASK_NAME);
        this.f26469a = application;
    }

    private void a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f657bb", new Object[]{this, bArr, str});
            return;
        }
        String path = this.f26469a.getCacheDir().getPath();
        File file = new File(path, str + "_MT.json");
        if (file.mkdirs()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(q2s q2sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/launcherx/TLGoodsUltronDXPreload");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        cwd A = v2s.o().A();
        if (A != null) {
            try {
                A.c(TAG, "新用户预拉取直播间宝贝口袋DX模板");
            } catch (Throwable th) {
                if (A != null) {
                    A.c(TAG, th.toString());
                    return;
                }
                return;
            }
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(this.f26469a);
        RequestImpl requestImpl = new RequestImpl("https://hudong.alicdn.com/api/data/v2/15b808d1dfa24b65a8bad0d2df922638.js");
        requestImpl.setRetryTime(3);
        requestImpl.setMethod("GET");
        byte[] bytedata = degradableNetwork.syncSend(requestImpl, null).getBytedata();
        if (bytedata != null && bytedata.length > 0) {
            UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
            ultronInstanceConfig.z("live");
            a q = a.q(ultronInstanceConfig, this.f26469a);
            HashMap hashMap = (HashMap) fkx.g(bytedata, HashMap.class, new Feature[0]);
            if (hashMap.containsKey(this.b)) {
                q.D().q(fkx.d((String) hashMap.get(this.b)));
                q.T(null);
                q.G().C();
                a(bytedata, this.b);
            }
            if (hashMap.containsKey(this.c)) {
                q.D().q(fkx.d((String) hashMap.get(this.c)));
                q.T(null);
                q.G().C();
                a(bytedata, this.c);
            }
        }
    }
}

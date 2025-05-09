package com.alibaba.security.realidentity;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.biz.start.UploadToken;
import com.alibaba.security.realidentity.service.upload.UploadFileModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z1 extends c2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String u = "10";
    public static final String v = "wU^s&Mx75NCr$BPmZngO^WRNgDmnVGX@";
    public final String q;
    public final boolean r;
    public final String s;
    public final ALBiometricsResult t;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements l4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f2912a;

        public a(CountDownLatch countDownLatch) {
            this.f2912a = countDownLatch;
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            f.b(z1.c(z1.this));
            this.f2912a.countDown();
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            f.b(z1.c(z1.this));
            this.f2912a.countDown();
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onProgress(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a56ab73", new Object[]{this, new Long(j), new Long(j2)});
            }
        }

        @Override // com.alibaba.security.realidentity.l4
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            z1 z1Var = z1.this;
            z1Var.k = str;
            if ("10".equals(z1.a(z1Var))) {
                z1.b(z1.this).dazzleVideoOssUrl = str;
                String a2 = i.a(new File(z1.c(z1.this)));
                z1.b(z1.this).videoHash = i.b(z1.this.l + a2 + z1.v);
            }
            f.b(z1.c(z1.this));
            this.f2912a.countDown();
        }
    }

    public z1(Context context, String str, RPBizConfig rPBizConfig, u4 u4Var, String str2, boolean z, String str3, ALBiometricsResult aLBiometricsResult) {
        super(context, str, rPBizConfig, u4Var, null, null, null);
        this.s = str2;
        this.q = str3;
        this.r = z;
        this.t = aLBiometricsResult;
    }

    public static /* synthetic */ String a(z1 z1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("88d1ea85", new Object[]{z1Var}) : z1Var.q;
    }

    public static /* synthetic */ ALBiometricsResult b(z1 z1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ALBiometricsResult) ipChange.ipc$dispatch("20adfb1", new Object[]{z1Var});
        }
        return z1Var.t;
    }

    public static /* synthetic */ String c(z1 z1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94d98143", new Object[]{z1Var});
        }
        return z1Var.s;
    }

    public static /* synthetic */ Object ipc$super(z1 z1Var, String str, Object... objArr) {
        if (str.hashCode() == -207205326) {
            super.onPostExecute((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/z1");
    }

    @Override // com.alibaba.security.realidentity.y1
    /* renamed from: a */
    public String doInBackground(UploadToken... uploadTokenArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32be7016", new Object[]{this, uploadTokenArr});
        }
        if (TextUtils.isEmpty(this.s)) {
            return null;
        }
        UploadFileModel uploadFileModel = new UploadFileModel();
        String format = new SimpleDateFormat("yyyyMMdd").format(Long.valueOf(System.currentTimeMillis()));
        String str = this.r ? "success" : "failure";
        uploadFileModel.mDestDir = "biometric/video/" + format + "/" + this.l + "/" + str;
        uploadFileModel.mFileType = "h264";
        String str2 = this.s;
        uploadFileModel.mLocalFilePath = str2;
        uploadFileModel.mRemoteFileName = new File(str2).getName();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object a2 = this.j.a("video/mp4", this.n.getOssConfig(), uploadFileModel, new a(countDownLatch));
        try {
            countDownLatch.await(h(), TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            this.j.a(a2);
        }
        return this.k;
    }

    @Override // com.alibaba.security.realidentity.y1
    /* renamed from: a */
    public void onPostExecute(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            super.onPostExecute(str);
        }
    }
}

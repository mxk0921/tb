package com.taobao.tao.scancode;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.scancode.ShareQRCodeScanView;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import java.util.List;
import tb.akp;
import tb.hjp;
import tb.iwr;
import tb.med;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements med {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.scancode.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0724a implements ShareQRCodeScanView.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0724a(a aVar) {
        }

        @Override // com.taobao.tao.scancode.ShareQRCodeScanView.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Void, Void, String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareData f12755a;
        public final /* synthetic */ ShareQRCodeScanView b;

        public b(a aVar, ShareData shareData, ShareQRCodeScanView shareQRCodeScanView) {
            this.f12755a = shareData;
            this.b = shareQRCodeScanView;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/scancode/QRCodeScanEngine$2");
        }

        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba63ca09", new Object[]{this, voidArr});
            }
            String link = this.f12755a.getLink();
            String urlBackFlow = ShareServiceApi.urlBackFlow(this.f12755a.getBusinessId(), "QRCode-Scan", this.f12755a.getLink());
            if (TextUtils.isEmpty(urlBackFlow)) {
                return link;
            }
            String shortenURL = new iwr().shortenURL(urlBackFlow);
            akp.h(ShareTargetType.Share2ScanCode.getValue());
            if (TextUtils.isEmpty(shortenURL) || urlBackFlow.equals(shortenURL)) {
                return link;
            }
            return shortenURL;
        }

        /* renamed from: b */
        public void onPostExecute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe870167", new Object[]{this, str});
            } else {
                this.b.createQrcode(str, -957150);
            }
        }
    }

    static {
        t2o.a(666894523);
        t2o.a(665845796);
    }

    @Override // tb.med
    public void a(ShareData shareData, List<String> list, String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6366d63a", new Object[]{this, shareData, list, str, jSONObject, new Boolean(z)});
            return;
        }
        ShareQRCodeScanView shareQRCodeScanView = new ShareQRCodeScanView(hjp.a().getApplicationContext());
        try {
            shareQRCodeScanView.showSnapshotDialog(list, shareData, str, jSONObject, z, new C0724a(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        new b(this, shareData, shareQRCodeScanView).execute(new Void[0]);
    }
}

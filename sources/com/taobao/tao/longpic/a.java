package com.taobao.tao.longpic;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.tao.longpic.ShareNewQRCodeView;
import com.taobao.tao.util.UriUtil;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import java.util.List;
import tb.akp;
import tb.ehs;
import tb.eis;
import tb.fis;
import tb.gis;
import tb.hjp;
import tb.hwd;
import tb.t2o;
import tb.vhs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements hwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.longpic.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0711a implements ShareNewQRCodeView.u {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0711a(a aVar) {
        }

        @Override // com.taobao.tao.longpic.ShareNewQRCodeView.u
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareData f12524a;
        public final /* synthetic */ String b;
        public final /* synthetic */ TBShareContent c;
        public final /* synthetic */ ShareNewQRCodeView d;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.longpic.a$b$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0712a implements gis {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f12525a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.longpic.a$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class RunnableC0713a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ String f12526a;

                public RunnableC0713a(String str) {
                    this.f12526a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar = b.this;
                    bVar.d.createQrcode(this.f12526a, bVar.b, -957150);
                }
            }

            public C0712a(String str) {
                this.f12525a = str;
            }

            @Override // tb.gis
            public void a(fis fisVar, vhs vhsVar) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("663f302b", new Object[]{this, fisVar, vhsVar});
                    return;
                }
                if (vhsVar == null || TextUtils.isEmpty(vhsVar.c)) {
                    str = akp.b(this.f12525a);
                } else if (hjp.TYPE_GEN3_CODE.equals(b.this.b)) {
                    str = akp.b(UriUtil.appendQueryParameter(this.f12525a, DispatchConstants.CONFIG_VERSION, UriUtil.getValue(Uri.parse(vhsVar.c), DispatchConstants.CONFIG_VERSION)).toString());
                } else {
                    str = akp.b(vhsVar.c);
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0713a(str));
            }
        }

        public b(a aVar, ShareData shareData, String str, TBShareContent tBShareContent, ShareNewQRCodeView shareNewQRCodeView) {
            this.f12524a = shareData;
            this.b = str;
            this.c = tBShareContent;
            this.d = shareNewQRCodeView;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/longpic/TLongPicEngine$2");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            String link = this.f12524a.getLink();
            if (hjp.TYPE_GEN3_CODE.equals(this.b)) {
                str = "QRCodeAnti";
            } else {
                str = "QRCode";
            }
            String urlBackFlow = ShareServiceApi.urlBackFlow(this.f12524a.getBusinessId(), str, this.f12524a.getLink());
            if (!TextUtils.isEmpty(urlBackFlow)) {
                akp.h(ShareTargetType.Share2QRCode.getValue());
                if (!TextUtils.isEmpty(urlBackFlow) && !link.equals(urlBackFlow)) {
                    link = urlBackFlow;
                }
            }
            eis b = a.b(this.c);
            b.c = link;
            try {
                b.k = "qrcode";
                ehs.j().i(hjp.a().getApplicationContext(), b, TPAction.COPY, new C0712a(link), ShareBizAdapter.getInstance().getAppEnv().getTTID());
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    static {
        t2o.a(666894518);
        t2o.a(665845800);
    }

    public static eis b(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eis) ipChange.ipc$dispatch("2f9cedab", new Object[]{tBShareContent});
        }
        if (tBShareContent == null) {
            return null;
        }
        eis eisVar = new eis();
        eisVar.f18604a = tBShareContent.businessId;
        eisVar.b = tBShareContent.description;
        eisVar.c = tBShareContent.url;
        eisVar.d = tBShareContent.imageUrl;
        eisVar.e = tBShareContent.shareScene;
        eisVar.h = tBShareContent.extraParams;
        if (tBShareContent.disableBackToClient) {
            eisVar.l = 0;
        }
        eisVar.f = "copy";
        eisVar.i = tBShareContent.popType.name;
        eisVar.j = tBShareContent.popUrl;
        return eisVar;
    }

    @Override // tb.hwd
    public void a(TBShareContent tBShareContent, ShareData shareData, List<String> list, String str, JSONObject jSONObject, String str2, boolean z, boolean z2, String str3, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f906d7cc", new Object[]{this, tBShareContent, shareData, list, str, jSONObject, str2, new Boolean(z), new Boolean(z2), str3, new Boolean(z3)});
            return;
        }
        ShareNewQRCodeView shareNewQRCodeView = new ShareNewQRCodeView(hjp.a().getApplicationContext());
        shareNewQRCodeView.showSnapshotDialog(list, shareData, str, jSONObject, str2, z, z2, tBShareContent, z3, new C0711a(this));
        new b(this, shareData, str3, tBShareContent, shareNewQRCodeView).execute(new Void[0]);
    }
}

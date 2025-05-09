package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.taobao.R;
import com.ut.share.ShareResponse;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.inter.ShareListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pxr implements xhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dis f26386a = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements dis {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(pxr pxrVar) {
        }

        @Override // tb.dis
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d11a", new Object[]{this, new Boolean(z)});
            } else {
                akp.h(ShareTargetType.Share2Copy.getValue());
            }
        }

        @Override // tb.dis
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76bf38a5", new Object[]{this, str});
                return;
            }
            ShareBizAdapter.getInstance().getAppEnv().j(str);
            gj8.k(2);
        }

        @Override // tb.dis
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
            } else {
                Toast.makeText(hjp.a().getApplicationContext(), Localization.q(R.string.taobao_app_1010_1_17849), 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements gis {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eis f26387a;

        public b(eis eisVar) {
            this.f26387a = eisVar;
        }

        @Override // tb.gis
        public void a(fis fisVar, vhs vhsVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("663f302b", new Object[]{this, fisVar, vhsVar});
            } else if (vhsVar != null) {
                String str2 = vhsVar.f30021a;
                if (TextUtils.isEmpty(str2)) {
                    String str3 = this.f26387a.b;
                    if (TextUtils.isEmpty(str3)) {
                        str = this.f26387a.c;
                    } else {
                        str = str3.concat(" ").concat(this.f26387a.c);
                    }
                    str2 = akp.c(str);
                    ehs.l(hjp.a().getApplicationContext(), this.f26387a.c);
                }
                fisVar.b(hjp.a().getApplicationContext(), TPTargetType.COPY, str2, pxr.b(pxr.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c extends AsyncTask<Void, Void, String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eis f26388a;
        public final /* synthetic */ TBShareContent b;

        public c(eis eisVar, TBShareContent tBShareContent) {
            this.f26388a = eisVar;
            this.b = tBShareContent;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/impl/TBTaoPasswordShareHandler$3");
        }

        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ba63ca09", new Object[]{this, voidArr});
            }
            return new iwr().shortenURL(this.f26388a.c);
        }

        /* renamed from: b */
        public void onPostExecute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe870167", new Object[]{this, str});
            } else {
                pxr.c(pxr.this, this.b.smsTemplate.replace("{url}", str), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements gis {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eis f26389a;
        public final /* synthetic */ TBShareContent b;

        public d(eis eisVar, TBShareContent tBShareContent) {
            this.f26389a = eisVar;
            this.b = tBShareContent;
        }

        @Override // tb.gis
        public void a(fis fisVar, vhs vhsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("663f302b", new Object[]{this, fisVar, vhsVar});
            } else if (vhsVar != null) {
                String str = vhsVar.f30021a;
                if (TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(this.f26389a.b)) {
                        str = this.f26389a.c;
                    } else {
                        str = this.f26389a.b;
                    }
                }
                pxr.c(pxr.this, str, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ShareListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(pxr pxrVar) {
        }

        @Override // com.ut.share.inter.ShareListener
        public void onResponse(ShareResponse shareResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5dc66e8", new Object[]{this, shareResponse});
            }
        }
    }

    static {
        t2o.a(666894430);
        t2o.a(666894439);
    }

    public static /* synthetic */ dis b(pxr pxrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dis) ipChange.ipc$dispatch("fdb78d40", new Object[]{pxrVar});
        }
        return pxrVar.f26386a;
    }

    public static /* synthetic */ void c(pxr pxrVar, String str, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1889b54a", new Object[]{pxrVar, str, tBShareContent});
        } else {
            pxrVar.d(str, tBShareContent);
        }
    }

    public static String h(List<String> list, String str) {
        Iterator<String> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dd2dd34", new Object[]{list, str});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        String str2 = "";
        while (list.iterator().hasNext()) {
            str2 = str2 + it.next() + str;
        }
        return str2.substring(0, str2.length() - 1);
    }

    @Override // tb.xhp
    public void a(String str, Map<String, String> map) {
        TaoPasswordShareType taoPasswordShareType;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de08c55", new Object[]{this, str, map});
            return;
        }
        TBShareContent e2 = bwr.h().e();
        if (e2 != null) {
            if (ShareTargetType.Share2Copy.getValue().equals(str)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeCopy;
                str2 = "Copy";
            } else if (ShareTargetType.Share2SMS.getValue().equals(str)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeSMS;
                str2 = "taopassword-sms";
            } else {
                taoPasswordShareType = null;
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                g(e2, taoPasswordShareType, str2);
            }
        }
    }

    public void e(eis eisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d704ecfe", new Object[]{this, eisVar});
            return;
        }
        his.b(true);
        try {
            ehs.j().i(hjp.a().getApplicationContext(), eisVar, TPAction.COPY, new b(eisVar), ShareBizAdapter.getInstance().getAppEnv().getTTID());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void f(eis eisVar, TBShareContent tBShareContent, TaoPasswordShareType taoPasswordShareType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6ecf97", new Object[]{this, eisVar, tBShareContent, taoPasswordShareType});
            return;
        }
        his.b(false);
        try {
            if (!TextUtils.isEmpty(tBShareContent.smsTemplate)) {
                new c(eisVar, tBShareContent).execute(new Void[0]);
            } else {
                ehs.j().i(hjp.a().getApplicationContext(), eisVar, TPAction.SMS, new d(eisVar, tBShareContent), ShareBizAdapter.getInstance().getAppEnv().getTTID());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d(String str, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd43b81", new Object[]{this, str, tBShareContent});
            return;
        }
        ShareData shareData = new ShareData();
        shareData.setText(str);
        List<String> list = tBShareContent.phoneNumberList;
        if (list != null && list.size() >= 1) {
            if (shareData.getUserInfo() == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("phoneNumbers", h(tBShareContent.phoneNumberList, ";"));
                shareData.setUserInfo(hashMap);
            } else {
                shareData.getUserInfo().put("phoneNumbers", h(tBShareContent.phoneNumberList, ";"));
            }
        }
        akp.g(hjp.a().getApplicationContext(), ShareTargetType.Share2SMS.getValue(), shareData, new e(this));
    }

    public final void g(TBShareContent tBShareContent, TaoPasswordShareType taoPasswordShareType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54a3f97", new Object[]{this, tBShareContent, taoPasswordShareType, str});
            return;
        }
        String str2 = tBShareContent.description;
        if (bwr.h().n() != null && !TextUtils.isEmpty(null)) {
            str2 = "null " + str2;
        }
        eis eisVar = new eis();
        String str3 = tBShareContent.businessId;
        eisVar.f18604a = str3;
        eisVar.b = str2;
        eisVar.c = ShareServiceApi.urlBackFlow(str3, str, tBShareContent.url);
        eisVar.d = tBShareContent.imageUrl;
        eisVar.e = tBShareContent.shareScene;
        eisVar.h = tBShareContent.extraParams;
        if (!TextUtils.isEmpty(str)) {
            eisVar.k = str.toLowerCase();
        } else {
            eisVar.k = "other";
        }
        eisVar.i = tBShareContent.popType.name;
        eisVar.j = tBShareContent.popUrl;
        if (tBShareContent.disableBackToClient) {
            eisVar.l = 0;
        }
        if (TaoPasswordShareType.ShareTypeCopy.getValue().equals(taoPasswordShareType.getValue())) {
            eisVar.f = "copy";
            e(eisVar);
        } else if (TaoPasswordShareType.ShareTypeSMS.getValue().equals(taoPasswordShareType.getValue())) {
            eisVar.f = "sms";
            f(eisVar, tBShareContent, taoPasswordShareType);
        }
    }
}

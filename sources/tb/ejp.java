package tb;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnResponse;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnResponseData;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ejp implements IBottomProxy.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVE_SHARE_ACTION_INFO_PARAMS = "liveShareActionInfoParams";

    /* renamed from: a  reason: collision with root package name */
    public Set<String> f18625a = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ejp ejpVar) {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            o3s.b("ShareFission", "[onError]  type: " + i);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            o3s.b("ShareFission", "[onSuccess]  type: " + i);
            if ((netBaseOutDo instanceof ShareReturnResponse) && netBaseOutDo.getData() != null) {
                ShareReturnResponseData shareReturnResponseData = (ShareReturnResponseData) netBaseOutDo.getData();
                if (shareReturnResponseData == null || !"true".equals(shareReturnResponseData.result) || TextUtils.isEmpty(shareReturnResponseData.toast)) {
                    Application application = v2s.o().f().getApplication();
                    if (shareReturnResponseData == null || TextUtils.isEmpty(shareReturnResponseData.toast)) {
                        str = "助力失败";
                    } else {
                        str = shareReturnResponseData.toast;
                    }
                    Toast.makeText(application, str, 1).show();
                    return;
                }
                Application application2 = v2s.o().f().getApplication();
                if (TextUtils.isEmpty(shareReturnResponseData.toast)) {
                    str2 = "助力成功";
                } else {
                    str2 = shareReturnResponseData.toast;
                }
                Toast.makeText(application2, str2, 1).show();
                o3s.b("ShareFission", "[onSuccess]  showToast  data.result: " + shareReturnResponseData.result + ", data.toast: " + shareReturnResponseData.toast);
            }
        }
    }

    static {
        t2o.a(295698528);
        t2o.a(806355128);
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy.a
    public void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d288972", new Object[]{this, map, str});
        } else if (map == null) {
            o3s.b("ShareFission", "[shareFissionReturn] params is empty");
        } else if (TextUtils.isEmpty(str)) {
            o3s.b("ShareFission", "[shareFissionReturn] liveId is empty");
        } else {
            if (this.f18625a == null) {
                this.f18625a = new HashSet();
            }
            String str2 = map.get(LIVE_SHARE_ACTION_INFO_PARAMS);
            if (TextUtils.isEmpty(str2)) {
                o3s.b("ShareFission", "[shareFissionReturn] liveShareActionInfoParams is empty");
            } else if (!((HashSet) this.f18625a).contains(str2)) {
                ShareReturnRequest shareReturnRequest = new ShareReturnRequest();
                shareReturnRequest.setParams(str2);
                try {
                    shareReturnRequest.setLiveId(Long.parseLong(str));
                } catch (NumberFormatException unused) {
                }
                new ekp(new a(this)).K(shareReturnRequest);
                ((HashSet) this.f18625a).add(str2);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy.a
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342cdad1", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            o3s.b("ShareFission", "[shareFissionReturn] url is empty");
        } else if (TextUtils.isEmpty(str2)) {
            o3s.b("ShareFission", "[shareFissionReturn] liveId is empty");
        } else {
            Uri parse = Uri.parse(str);
            HashMap hashMap = new HashMap();
            hashMap.put(LIVE_SHARE_ACTION_INFO_PARAMS, parse.getQueryParameter(LIVE_SHARE_ACTION_INFO_PARAMS));
            a(hashMap, str2);
        }
    }
}

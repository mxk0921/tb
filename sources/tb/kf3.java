package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.features.category.CategoryResponse;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.weex.WXEnvironment;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kf3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REQ_SELLER_ID = "sellerId";
    public static final String REQ_SHOP_ID = "shopId";
    public static final String REQ_SUPPORTWEEX = "supportWeex";

    /* renamed from: a  reason: collision with root package name */
    public RemoteBusiness f22628a;
    public IRemoteBaseListener b;
    public final String c;
    public final String d;

    static {
        t2o.a(764411967);
    }

    public kf3(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f22628a = null;
        this.b = null;
    }

    public void b(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ca8e2", new Object[]{this, iRemoteBaseListener});
        } else {
            this.b = iRemoteBaseListener;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb849d4", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.shop.cat.neo.get");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setNeedSession(false);
        JSONObject parseObject = JSON.parseObject(mtopRequest.getData());
        if (!TextUtils.isEmpty(this.c)) {
            parseObject.put("sellerId", (Object) this.c);
        } else if (!TextUtils.isEmpty(this.d)) {
            parseObject.put("shopId", (Object) this.d);
        }
        parseObject.put(REQ_SUPPORTWEEX, (Object) Boolean.valueOf(WXEnvironment.isCPUSupport()));
        mtopRequest.setData(parseObject.toString());
        RemoteBusiness bizId = RemoteBusiness.build((Context) Globals.getApplication(), mtopRequest, TaoHelper.getTTID()).reqContext((Object) null).setBizId(90);
        this.f22628a = bizId;
        bizId.setJsonType(JsonTypeEnum.ORIGINALJSON);
        this.f22628a.registeListener((IRemoteListener) this.b).startRequest(0, CategoryResponse.class);
    }
}

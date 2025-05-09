package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai2.material.request.Response;
import java.lang.reflect.Type;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.drc;
import tb.hrc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yrj<T extends hrc> implements drc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RemoteBusiness f32302a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends TypeReference<Response<T>> {
        public b(yrj yrjVar, Type... typeArr) {
            super(typeArr);
        }
    }

    static {
        t2o.a(782237927);
        t2o.a(782237922);
    }

    public void cancel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.f32302a;
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements PropertyFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(yrj yrjVar) {
        }

        @Override // com.alibaba.fastjson.serializer.PropertyFilter
        public boolean apply(Object obj, String str, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12c7643b", new Object[]{this, obj, str, obj2})).booleanValue();
            }
            return !TextUtils.equals("requestPolicy", str) && !TextUtils.equals("requestName", str) && !TextUtils.equals("priority", str) && !TextUtils.equals("method", str) && !TextUtils.equals("cachePath", str) && !TextUtils.equals("aPI", str) && !TextUtils.equals("cacheTimeS", str);
        }
    }

    @Override // tb.drc
    public Response<T> a(drc.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("6b79651b", new Object[]{this, aVar});
        }
        wjn wjnVar = (wjn) aVar;
        erc a2 = wjnVar.a();
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(a2.getAPI());
        mtopRequest.setNeedSession(a2.needLogin());
        mtopRequest.setData(JSON.toJSONString(a2, new a(this), new SerializerFeature[0]));
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(false);
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        this.f32302a = build;
        build.mtopProp.method = a2.getMethod();
        MtopResponse syncRequest = this.f32302a.syncRequest();
        if (syncRequest == null) {
            return new Response<>(-101, "response is null");
        }
        if (syncRequest.getBytedata() == null) {
            if (syncRequest.getMtopStat() != null) {
                str = syncRequest.getMtopStat().toString();
            } else {
                str = syncRequest.getRetCode() + "|" + syncRequest.getMappingCode();
            }
            return new Response<>(syncRequest.getResponseCode(), str);
        }
        try {
            return (Response) JSON.parseObject(new String(syncRequest.getBytedata()), new b(this, wjnVar.b()), new Feature[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return new Response<>(syncRequest.getResponseCode(), e.getMessage());
        }
    }
}

package com.taobao.android.fluid.business.videocollection.dramacollection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.utils.ProductDataHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.dramacollection.a;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import tb.ir9;
import tb.nz3;
import tb.sv2;
import tb.sz3;
import tb.t2o;
import tb.tep;
import tb.yao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DramaCollectionDataManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f7717a = null;

    static {
        t2o.a(468713701);
    }

    public static /* synthetic */ a a(DramaCollectionDataManager dramaCollectionDataManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f62bddd8", new Object[]{dramaCollectionDataManager});
        }
        return dramaCollectionDataManager.f7717a;
    }

    public static /* synthetic */ a b(DramaCollectionDataManager dramaCollectionDataManager, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("60de0ca3", new Object[]{dramaCollectionDataManager, aVar});
        }
        dramaCollectionDataManager.f7717a = aVar;
        return aVar;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f90f100", new Object[]{this});
            return;
        }
        a aVar = this.f7717a;
        if (aVar != null && aVar.e() != null) {
            this.f7717a.e().clear();
        }
    }

    public a d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b8bbefd", new Object[]{this, aVar});
        }
        if (this.f7717a == null) {
            this.f7717a = new a();
            JSONObject b = nz3.b(aVar);
            String string = b.getString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
            int intValue = b.getIntValue("count");
            String string2 = b.getString("collectionName");
            this.f7717a.f(intValue);
            this.f7717a.g(string);
            this.f7717a.i(string2);
        }
        return this.f7717a;
    }

    public List<a.C0415a> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("545fb84e", new Object[]{this});
        }
        a aVar = this.f7717a;
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public boolean f(String str, final sv2<yao<a>> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8dbd7ecb", new Object[]{this, str, sv2Var})).booleanValue();
        }
        a aVar = this.f7717a;
        if (aVar == null || sz3.a(aVar.e())) {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.taobao.guang.collection.videos.locked.panel.get");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(false);
            mtopRequest.setNeedSession(false);
            HashMap hashMap = new HashMap();
            hashMap.put("contentId", str);
            mtopRequest.dataParams = hashMap;
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
            RemoteBusiness build = RemoteBusiness.build(mtopRequest);
            build.registerListener(new IRemoteListener() { // from class: com.taobao.android.fluid.business.videocollection.dramacollection.DramaCollectionDataManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    ir9.b("DramaCollectionDataManager", "requestCollectionsList error:" + mtopResponse);
                    sv2 sv2Var2 = sv2Var;
                    if (sv2Var2 != null) {
                        sv2Var2.a(yao.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), mtopResponse));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    int i2 = 0;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    ir9.b("DramaCollectionDataManager", "requestCollectionsList success:" + mtopResponse);
                    try {
                        JSONObject jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
                        String string = jSONObject.getString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
                        String string2 = jSONObject.getString("title");
                        String string3 = jSONObject.getString("summary");
                        JSONArray jSONArray = jSONObject.getJSONArray("episodeLockedInfos");
                        ArrayList arrayList = new ArrayList();
                        while (i2 < jSONArray.size()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            i2++;
                            arrayList.add(new a.C0415a(i2, jSONObject2.getString("contentId"), jSONObject2.getBoolean(ProductDataHelper.KEY_LOCKED).booleanValue()));
                        }
                        if (DramaCollectionDataManager.a(DramaCollectionDataManager.this) == null) {
                            DramaCollectionDataManager.b(DramaCollectionDataManager.this, new a());
                        }
                        if (DramaCollectionDataManager.a(DramaCollectionDataManager.this).b() == null) {
                            DramaCollectionDataManager.a(DramaCollectionDataManager.this).g(string);
                        }
                        if (DramaCollectionDataManager.a(DramaCollectionDataManager.this).d() == null) {
                            DramaCollectionDataManager.a(DramaCollectionDataManager.this).i(string2);
                        }
                        if (DramaCollectionDataManager.a(DramaCollectionDataManager.this).a() != arrayList.size()) {
                            DramaCollectionDataManager.a(DramaCollectionDataManager.this).f(arrayList.size());
                        }
                        if (DramaCollectionDataManager.a(DramaCollectionDataManager.this).c() == null) {
                            DramaCollectionDataManager.a(DramaCollectionDataManager.this).h(string3);
                        }
                        DramaCollectionDataManager.a(DramaCollectionDataManager.this).j(arrayList);
                        sv2 sv2Var2 = sv2Var;
                        if (sv2Var2 != null) {
                            sv2Var2.a(yao.h("mtop", DramaCollectionDataManager.a(DramaCollectionDataManager.this)));
                        }
                    } catch (Exception unused) {
                        ir9.b("DramaCollectionDataManager", "requestCollectionsList error:" + mtopResponse);
                        sv2 sv2Var3 = sv2Var;
                        if (sv2Var3 != null) {
                            sv2Var3.a(yao.a(mtopResponse.getRetCode(), "parse error", mtopResponse));
                        }
                    }
                }
            });
            build.startRequest();
            return false;
        }
        if (sv2Var != null) {
            sv2Var.a(yao.h("cache", this.f7717a));
        }
        return true;
    }
}

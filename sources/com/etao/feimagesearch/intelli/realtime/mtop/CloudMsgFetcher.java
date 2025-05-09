package com.etao.feimagesearch.intelli.realtime.mtop;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.DataPool;
import com.etao.feimagesearch.intelli.realtime.mtop.CloudMsgFetcher;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.gd2;
import tb.k1p;
import tb.lg4;
import tb.r4p;
import tb.t2o;
import tb.u7j;
import tb.wkn;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CloudMsgFetcher {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "realtime_CloudMsgFetcher";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public interface a {
            void onFailed(int i, String str);

            void onSuccess(JSONObject jSONObject);
        }

        static {
            t2o.a(730857683);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public Companion() {
        }

        public final void a(HashMap<Integer, DataPool.c> hashMap, final a aVar, String str, String str2) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("337d5e3c", new Object[]{this, hashMap, aVar, str, str2});
                return;
            }
            ckf.g(hashMap, "modelMap");
            ckf.g(aVar, "resultCallback");
            ckf.g(str, "mssid");
            ckf.g(str2, "extraInfo");
            agh.h(CloudMsgFetcher.TAG, "begin request cloud msg--");
            ArrayList arrayList = new ArrayList();
            Iterator<DataPool.c> it = hashMap.values().iterator();
            while (true) {
                str3 = "";
                if (!it.hasNext()) {
                    break;
                }
                wkn b = it.next().b();
                Bitmap g = b.g();
                if (g != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("imageId", String.valueOf(b.f()));
                    Bitmap m = gd2.m(g, 640);
                    Float f = null;
                    Float valueOf = m == null ? null : Float.valueOf(m.getWidth());
                    if (m != null) {
                        f = Float.valueOf(m.getHeight());
                    }
                    hashMap2.put("region", String.format("0,%f,0,%f", Arrays.copyOf(new Object[]{valueOf, f}, 2)));
                    String c = gd2.c(m, Bitmap.CompressFormat.JPEG, 70);
                    if (c != null) {
                        str3 = c;
                    }
                    hashMap2.put("imageBase64", str3);
                    arrayList.add(hashMap2);
                }
            }
            HashMap hashMap3 = new HashMap(10);
            if (arrayList.size() > 0) {
                str3 = JSON.toJSONString(arrayList);
            }
            ckf.f(str3, "if (imageInfoArray.size …g(imageInfoArray) else \"\"");
            hashMap3.put("imageInfos", str3);
            hashMap3.put("mssid", str);
            if (!TextUtils.isEmpty(str2) && str2.length() < lg4.P2()) {
                hashMap3.put("plt_search_extraInfo", str2);
            }
            hashMap3.put("source", "realtime_search_card");
            String i = caa.i();
            ckf.f(i, "getSVersion()");
            hashMap3.put("sversion", i);
            String o = caa.o(caa.c());
            ckf.f(o, "getUtdid(GlobalAdapter.getCtx())");
            hashMap3.put("utd_id", o);
            hashMap3.put("debug", String.valueOf(caa.q()));
            hashMap3.put("api", "mtop.relationrecommend.PailitaoRecommend.recommend");
            String c2 = k1p.c();
            ckf.f(c2, "getEditionCode()");
            hashMap3.put(r4p.KEY_EDITION_CODE, c2);
            Pair<String, String> b2 = u7j.b();
            if (b2 != null && !TextUtils.isEmpty((CharSequence) b2.first) && !TextUtils.isEmpty((CharSequence) b2.second)) {
                Object obj = b2.first;
                ckf.f(obj, "it.first");
                Object obj2 = b2.second;
                ckf.f(obj2, "it.second");
                hashMap3.put(obj, obj2);
            }
            HashMap hashMap4 = new HashMap(2);
            String jSONString = JSON.toJSONString(hashMap3);
            ckf.f(jSONString, "toJSONString(params)");
            hashMap4.put("params", jSONString);
            hashMap4.put("appId", "32969");
            u7j.a("mtop.relationrecommend.PailitaoRecommend.recommend", "1.0", hashMap4, new IRemoteBaseListener() { // from class: com.etao.feimagesearch.intelli.realtime.mtop.CloudMsgFetcher$Companion$fetchCloudMsg$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj3});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("onError: ");
                    sb.append(i2);
                    sb.append(' ');
                    String str4 = null;
                    sb.append((Object) (mtopResponse == null ? null : mtopResponse.getRetMsg()));
                    agh.c(CloudMsgFetcher.TAG, sb.toString());
                    CloudMsgFetcher.Companion.a aVar2 = CloudMsgFetcher.Companion.a.this;
                    if (mtopResponse != null) {
                        str4 = mtopResponse.getRetMsg();
                    }
                    aVar2.onFailed(i2, ckf.p("onError: ", str4));
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj3});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("onSystemError: ");
                    sb.append(i2);
                    sb.append(' ');
                    String str4 = null;
                    sb.append((Object) (mtopResponse == null ? null : mtopResponse.getRetMsg()));
                    agh.c(CloudMsgFetcher.TAG, sb.toString());
                    CloudMsgFetcher.Companion.a aVar2 = CloudMsgFetcher.Companion.a.this;
                    if (mtopResponse != null) {
                        str4 = mtopResponse.getRetMsg();
                    }
                    aVar2.onFailed(i2, ckf.p("onSystemError: ", str4));
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj3) {
                    xhv xhvVar;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj3});
                        return;
                    }
                    agh.h(CloudMsgFetcher.TAG, ckf.p("onSuccess: ", Integer.valueOf(i2)));
                    if (mtopResponse != null) {
                        CloudMsgFetcher.Companion.a aVar2 = CloudMsgFetcher.Companion.a.this;
                        try {
                            byte[] bytedata = mtopResponse.getBytedata();
                            ckf.f(bytedata, "mtopResponse.bytedata");
                            Charset forName = Charset.forName("utf-8");
                            ckf.f(forName, "forName(charsetName)");
                            JSONObject parseObject = JSON.parseObject(new String(bytedata, forName));
                            if (parseObject == null) {
                                xhvVar = null;
                            } else {
                                Object obj4 = parseObject.get("data");
                                if (obj4 != null) {
                                    JSONObject jSONObject = (JSONObject) obj4;
                                    JSONArray jSONArray = (JSONArray) jSONObject.get("result");
                                    if (jSONArray != null && jSONArray.size() >= 1 && (jSONArray.get(0) instanceof String)) {
                                        Object obj5 = jSONArray.get(0);
                                        if (obj5 != null) {
                                            if (ckf.b("ok", (String) obj5)) {
                                                aVar2.onSuccess(jSONObject);
                                            } else {
                                                aVar2.onFailed(10004, "onError: result[0] is not ok");
                                            }
                                            xhvVar = xhv.INSTANCE;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                    }
                                    aVar2.onFailed(10003, "onError: result length or result[0] illegal");
                                    xhvVar = xhv.INSTANCE;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                }
                            }
                            if (xhvVar == null) {
                                aVar2.onFailed(10002, "onError: content is not json object");
                            }
                        } catch (UnsupportedEncodingException e) {
                            aVar2.onFailed(10001, ckf.p("onError: parse failed ", e.getMessage()));
                        }
                    }
                }
            }, false, true);
        }
    }

    static {
        t2o.a(730857682);
    }
}

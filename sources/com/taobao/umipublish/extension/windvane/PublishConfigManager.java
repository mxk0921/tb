package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.fno;
import tb.gjh;
import tb.gl4;
import tb.krq;
import tb.t2o;
import tb.vdv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PublishConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(944767077);
    }

    public static /* synthetic */ void a(PublishConfigManager publishConfigManager, Context context, JSONObject jSONObject, vdv vdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa94c4e7", new Object[]{publishConfigManager, context, jSONObject, vdvVar});
        } else {
            publishConfigManager.f(context, jSONObject, vdvVar);
        }
    }

    public static /* synthetic */ void b(PublishConfigManager publishConfigManager, Context context, JSONObject jSONObject, vdv vdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e605c5c6", new Object[]{publishConfigManager, context, jSONObject, vdvVar});
        } else {
            publishConfigManager.h(context, jSONObject, vdvVar);
        }
    }

    public static /* synthetic */ void c(PublishConfigManager publishConfigManager, Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52d8027", new Object[]{publishConfigManager, context, jSONObject, str});
        } else {
            publishConfigManager.d(context, jSONObject, str);
        }
    }

    public final void d(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d584c8", new Object[]{this, context, jSONObject, str});
        } else {
            fno.o(context, e(jSONObject), str);
        }
    }

    public final String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d9b852a", new Object[]{this, jSONObject});
        }
        JSONObject parseObject = JSON.parseObject(jSONObject.toString());
        parseObject.remove(gl4.CONFIG_POLICY);
        String a2 = gjh.a();
        String m = krq.m(parseObject.toString());
        return m + "|" + a2;
    }

    public final void f(final Context context, JSONObject jSONObject, final vdv<String> vdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34481197", new Object[]{this, context, jSONObject, vdvVar});
            return;
        }
        final String e = e(jSONObject);
        new AsyncTask<Void, Void, String>(this) { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/PublishConfigManager$5");
            }

            /* renamed from: a */
            public String doInBackground(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("ba63ca09", new Object[]{this, voidArr});
                }
                return fno.h(context, e, "");
            }

            /* renamed from: b */
            public void onPostExecute(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fe870167", new Object[]{this, str});
                } else {
                    vdvVar.a(str);
                }
            }
        }.execute(new Void[0]);
    }

    public void g(final Context context, final JSONObject jSONObject, final vdv<String> vdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29a6432", new Object[]{this, context, jSONObject, vdvVar});
            return;
        }
        String string = jSONObject.getString(gl4.CONFIG_POLICY);
        if (TextUtils.isEmpty(string)) {
            string = "netFirst";
        }
        if ("netFirst".equals(string)) {
            h(context, jSONObject, new vdv<String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: b */
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12157bae", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                        PublishConfigManager.a(PublishConfigManager.this, context, jSONObject, vdvVar);
                    } else {
                        vdvVar.a(str);
                    }
                }
            });
        } else if ("onlyNet".equals(string)) {
            h(context, jSONObject, new vdv<String>(this) { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: b */
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12157bae", new Object[]{this, str});
                    } else {
                        vdvVar.a(str);
                    }
                }
            });
        } else if ("cacheFirst".equals(string)) {
            f(context, jSONObject, new vdv<String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: b */
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12157bae", new Object[]{this, str});
                    } else if (TextUtils.isEmpty(str)) {
                        PublishConfigManager.b(PublishConfigManager.this, context, jSONObject, vdvVar);
                    } else {
                        vdvVar.a(str);
                        PublishConfigManager.b(PublishConfigManager.this, context, jSONObject, null);
                    }
                }
            });
        } else if ("onlyCache".equals(string)) {
            f(context, jSONObject, new vdv<String>() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: b */
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12157bae", new Object[]{this, str});
                        return;
                    }
                    vdvVar.a(str);
                    PublishConfigManager.b(PublishConfigManager.this, context, jSONObject, null);
                }
            });
        }
    }

    public final void h(final Context context, final JSONObject jSONObject, final vdv<String> vdvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4568b195", new Object[]{this, context, jSONObject, vdvVar});
            return;
        }
        GuangPublishConfigRequest guangPublishConfigRequest = new GuangPublishConfigRequest();
        guangPublishConfigRequest.setParams(jSONObject.toString());
        MtopBusiness.build(Mtop.instance(null), guangPublishConfigRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.umipublish.extension.windvane.PublishConfigManager.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                vdv vdvVar2 = vdvVar;
                if (vdvVar2 != null) {
                    vdvVar2.a(null);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse.getDataJsonObject() == null) {
                    str = "";
                } else {
                    str = mtopResponse.getDataJsonObject().toString();
                }
                vdv vdvVar2 = vdvVar;
                if (vdvVar2 != null) {
                    vdvVar2.a(str);
                }
                if (!TextUtils.isEmpty(str)) {
                    PublishConfigManager.c(PublishConfigManager.this, context, jSONObject, str);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                vdv vdvVar2 = vdvVar;
                if (vdvVar2 != null) {
                    vdvVar2.a(null);
                }
            }
        }).reqMethod(MethodEnum.POST).startRequest();
    }
}

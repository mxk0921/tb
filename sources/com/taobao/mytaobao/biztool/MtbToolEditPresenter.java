package com.taobao.mytaobao.biztool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Collections;
import kotlin.TypeCastException;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ckf;
import tb.t2o;
import tb.uj3;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbToolEditPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MtbToolEditActivity b;
    public int e;
    public boolean f;

    /* renamed from: a  reason: collision with root package name */
    public final String f11203a = "Page_MyTB_itool";
    public final JSONArray c = new JSONArray();
    public final JSONArray d = new JSONArray();

    static {
        t2o.a(745537667);
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d2068c", new Object[]{this, jSONObject});
            return;
        }
        ckf.h(jSONObject, "data");
        String str = this.f11203a;
        TBS.Ext.commitEvent(str, 2101, "/mytaobao.itool.add", null, null, "bizCode=" + jSONObject.getString("bizCode"));
    }

    public final void b(JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4a773f", new Object[]{this, jSONObject, new Integer(i), new Integer(i2)});
            return;
        }
        TBS.Ext.commitEvent(this.f11203a, 2101, "/mytaobao.itool.drag", null, null, "bizCode=" + jSONObject.getString("bizCode"), "fromIndex=" + i, "toIndex=" + i2);
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8551bd", new Object[]{this, jSONObject});
            return;
        }
        ckf.h(jSONObject, "data");
        String str = this.f11203a;
        TBS.Ext.commitEvent(str, 2101, "/mytaobao.itool.delete", null, null, "bizCode=" + jSONObject.getString("bizCode"));
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c96aba", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.statistic.page");
        mtopRequest.setVersion("1.0");
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        build.setUnitStrategy("UNIT_TRADE");
        build.reqMethod(MethodEnum.POST);
        build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.biztool.MtbToolEditPresenter$fetchPageData$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                MtbToolEditActivity i2 = MtbToolEditPresenter.this.i();
                if (i2 != null) {
                    i2.t3();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                MtbToolEditActivity i2 = MtbToolEditPresenter.this.i();
                if (i2 != null) {
                    i2.t3();
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
                ckf.h(mtopResponse, "mtopResponse");
                try {
                    byte[] bytedata = mtopResponse.getBytedata();
                    ckf.c(bytedata, "mtopResponse.bytedata");
                    JSONObject parseObject = JSON.parseObject(new String(bytedata, uj3.UTF_8));
                    JSONArray jSONArray = parseObject.getJSONObject("data").getJSONArray("userCustom");
                    MtbToolEditPresenter.this.h().clear();
                    MtbToolEditPresenter.this.l(0);
                    ckf.c(jSONArray, "userCustom");
                    int i3 = 0;
                    for (Object obj2 : jSONArray) {
                        i3++;
                        if (i3 < 0) {
                            yz3.p();
                            throw null;
                        } else if (obj2 != null) {
                            JSONObject jSONObject = (JSONObject) obj2;
                            if (ckf.b(jSONObject.getString("canRemove"), "false")) {
                                MtbToolEditPresenter mtbToolEditPresenter = MtbToolEditPresenter.this;
                                mtbToolEditPresenter.l(mtbToolEditPresenter.f() + 1);
                            }
                            jSONObject.put("mtbUniId", (Object) Integer.valueOf(i3));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                    MtbToolEditPresenter.this.h().addAll(jSONArray);
                    JSONArray jSONArray2 = parseObject.getJSONObject("data").getJSONArray("all");
                    ckf.c(jSONArray2, "all");
                    int i4 = 0;
                    for (Object obj3 : jSONArray2) {
                        i4++;
                        if (i4 < 0) {
                            yz3.p();
                            throw null;
                        } else if (obj3 != null) {
                            ((JSONObject) obj3).put("mtbUniId", (Object) Integer.valueOf(i4 + 100));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                    MtbToolEditPresenter.this.g().clear();
                    for (Object obj4 : jSONArray2) {
                        i2++;
                        if (i2 < 0) {
                            yz3.p();
                            throw null;
                        } else if (obj4 != null) {
                            ((JSONObject) obj4).put("mtbUniId", (Object) Integer.valueOf(i2));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                        }
                    }
                    MtbToolEditPresenter.this.g().addAll(jSONArray2);
                    MtbToolEditActivity i5 = MtbToolEditPresenter.this.i();
                    if (i5 != null) {
                        i5.u3(MtbToolEditPresenter.this.h(), MtbToolEditPresenter.this.g());
                    }
                } catch (Throwable unused) {
                    MtbToolEditActivity i6 = MtbToolEditPresenter.this.i();
                    if (i6 != null) {
                        i6.t3();
                    }
                }
            }
        });
        build.startRequest();
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b57c98cc", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final JSONArray g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9157b467", new Object[]{this});
        }
        return this.d;
    }

    public final JSONArray h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d5e8423f", new Object[]{this});
        }
        return this.c;
    }

    public final MtbToolEditActivity i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbToolEditActivity) ipChange.ipc$dispatch("65c13d89", new Object[]{this});
        }
        return this.b;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("365f474", new Object[]{this});
        }
        return this.f11203a;
    }

    public final boolean k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c1bae1e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.e;
        if (i < i3 || i2 < i3) {
            return false;
        }
        JSONObject jSONObject = this.c.getJSONObject(i);
        if (i < i2) {
            int i4 = i;
            while (i4 < i2) {
                int i5 = i4 + 1;
                Collections.swap(this.c, i4, i5);
                i4 = i5;
            }
        } else {
            int i6 = i2 + 1;
            if (i >= i6) {
                int i7 = i;
                while (true) {
                    Collections.swap(this.c, i7, i7 - 1);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        this.f = true;
        ckf.c(jSONObject, "dragData");
        b(jSONObject, i, i2);
        return true;
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5a9156", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739227f1", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void n(MtbToolEditActivity mtbToolEditActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ddcf51", new Object[]{this, mtbToolEditActivity});
        } else {
            this.b = mtbToolEditActivity;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55c5c27", new Object[]{this});
        } else if (this.f) {
            this.f = false;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.taobao.mclaren.statistic.page.save");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Object obj : this.c) {
                if (obj != null) {
                    jSONArray.add(((JSONObject) obj).getString("bizCode"));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
            jSONObject.put("bizList", (Object) jSONArray.toJSONString());
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
            build.setUnitStrategy("UNIT_TRADE");
            build.reqMethod(MethodEnum.POST);
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.biztool.MtbToolEditPresenter$considerSaveData$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj2});
                    } else {
                        ckf.h(mtopResponse, "mtopResponse");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj2});
                    }
                }
            });
            build.startRequest();
        }
    }
}

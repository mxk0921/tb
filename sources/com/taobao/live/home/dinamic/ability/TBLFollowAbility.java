package com.taobao.live.home.dinamic.ability;

import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c8;
import tb.d8;
import tb.e8;
import tb.f8;
import tb.gt9;
import tb.k8;
import tb.m8;
import tb.n8;
import tb.t2o;
import tb.u8;
import tb.w8;
import tb.yhr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TBLFollowAbility extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long TBLFOLLOW = 2368429612251409246L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355374);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public TBLFollowAbility build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLFollowAbility) ipChange.ipc$dispatch("8f8a3b82", new Object[]{this, obj});
            }
            return new TBLFollowAbility();
        }
    }

    static {
        t2o.a(806355371);
    }

    public static /* synthetic */ Object ipc$super(TBLFollowAbility tBLFollowAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/home/dinamic/ability/TBLFollowAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, final k8 k8Var, final u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (!(n8Var == null || n8Var.h() == null)) {
            JSONObject h = n8Var.h();
            String string = h.getString("liveFollow");
            String string2 = h.getString("accountId");
            h.getString("sourcePage");
            boolean parseBoolean = Boolean.parseBoolean(h.getString(gt9.MTOP_ISFOLLOW));
            final boolean parseBoolean2 = Boolean.parseBoolean(h.getString("notToast"));
            h.getJSONObject("extParams");
            if (TextUtils.isEmpty(string2)) {
                return new d8();
            }
            if (!Boolean.parseBoolean(string)) {
                if (parseBoolean) {
                    new yhr(new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.ability.TBLFollowAbility.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                u8Var.callback("failure", new e8());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                u8Var.callback("failure", new e8());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(gt9.MTOP_ISFOLLOW, (Object) "true");
                            if (!parseBoolean2) {
                                Toast.makeText(k8Var.d(), "关注成功", 1).show();
                            }
                            u8Var.callback("success", new f8(jSONObject));
                        }
                    }).b(string2);
                } else {
                    new yhr(new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.ability.TBLFollowAbility.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                u8Var.callback("failure", new e8());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            } else {
                                u8Var.callback("failure", new e8());
                            }
                        }

                        @Override // com.taobao.tao.remotebusiness.IRemoteListener
                        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(gt9.MTOP_ISFOLLOW, (Object) "false");
                            if (!parseBoolean2) {
                                Toast.makeText(k8Var.d(), "取消关注成功", 1).show();
                            }
                            u8Var.callback("success", new f8(jSONObject));
                        }
                    }).c(string2);
                }
            }
        }
        return new d8();
    }
}

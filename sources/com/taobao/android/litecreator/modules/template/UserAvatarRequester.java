package com.taobao.android.litecreator.modules.template;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.File;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONException;
import tb.cg9;
import tb.ed2;
import tb.odg;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UserAvatarRequester {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8294a;
        public final /* synthetic */ b b;

        public a(UserAvatarRequester userAvatarRequester, String str, b bVar) {
            this.f8294a = str;
            this.b = bVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() == null || succPhenixEvent.isIntermediate()) {
                this.b.onFail("get bitmap fail", Constants.ErrorDesc.downloadError);
                TLog.loge("LC", "preloadUserHeadPic Fail ,download error");
            } else {
                ed2.q(succPhenixEvent.getDrawable().getBitmap(), this.f8294a);
                this.b.onSuccess(this.f8294a);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void onFail(String str, String str2);

        void onSuccess(String str);
    }

    static {
        t2o.a(511705301);
    }

    public static /* synthetic */ void a(UserAvatarRequester userAvatarRequester, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88918ae9", new Object[]{userAvatarRequester, str, bVar});
        } else {
            userAvatarRequester.c(str, bVar);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85778ea1", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Globals.getApplication().getCacheDir());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("guangguang");
        String sb2 = sb.toString();
        cg9.h(sb2);
        if (TextUtils.isEmpty(str)) {
            return sb2 + str2 + "user_head_default.jpg";
        }
        return sb2 + str2 + "user_head_" + str.hashCode() + ".jpg";
    }

    public final void c(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da9c24f", new Object[]{this, str, bVar});
            return;
        }
        String b2 = b(str);
        if (cg9.l(b2)) {
            bVar.onSuccess(b2);
        } else {
            s0m.B().T(str).succListener(new a(this, b2, bVar)).fetch();
        }
    }

    public void d(Context context, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afae963c", new Object[]{this, context, bVar});
        } else {
            MtopBusiness.build(Mtop.instance((String) null, context), new UserAvatarRequestParams()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.modules.template.UserAvatarRequester.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    } else {
                        str = "";
                    }
                    bVar.onFail("mtop_error", str);
                    odg.c("LC_UserAvatarRequester", "mtop_error " + str);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    odg.d("LC_UserAvatarRequester", "onSuccess " + mtopResponse.toString());
                    if (mtopResponse.getDataJsonObject() != null) {
                        try {
                            UserAvatarRequester.a(UserAvatarRequester.this, mtopResponse.getDataJsonObject().getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR), bVar);
                        } catch (JSONException e) {
                            bVar.onFail("json_parse_error", e.getMessage());
                        }
                    } else {
                        bVar.onFail("mtop_error", "response is empty");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    } else {
                        str = "";
                    }
                    bVar.onFail("mtop_system_error", str);
                    odg.c("LC_UserAvatarRequester", "mtop_system_error " + str);
                }
            }).startRequest();
        }
    }
}

package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.feedback;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.feedback.FeedbackResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view.HomeMainSecondFragment;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arq;
import tb.ot1;
import tb.r0h;
import tb.t2o;
import tb.y5c;
import tb.yh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FeedbackCtrl implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String S_DEGRADE_DATA = "{\"cardData\": [],\"templateName\": \"taolive_feedback_failed\",\"type\": \"taoliveDislike\"}";
    private static final String TAG = FeedbackCtrl.class.getSimpleName();
    private d mPointBuryCallback;
    private View mContainer = null;
    private DinamicDataObject mData = null;
    private ot1 mBusiness = new ot1(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FeedbackCtrl.this.liveFeedbackClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FeedbackCtrl.this.anchorFeedbackClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FeedbackCtrl.this.imageFeedbackClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
    }

    static {
        t2o.a(310378761);
        t2o.a(589299719);
    }

    private JSONObject getDegradeData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b4d3f231", new Object[]{this});
        }
        return JSON.parseObject(S_DEGRADE_DATA);
    }

    public View getFeedbackView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("482a4e3", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        if (this.mContainer == null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.live_home_main_feedback_flexalocal, (ViewGroup) null, false);
            this.mContainer = inflate;
            View findViewById = inflate.findViewById(R.id.live_dinamic_feedback_live);
            if (findViewById != null) {
                ViewProxy.setOnClickListener(findViewById, new a());
            }
            View findViewById2 = this.mContainer.findViewById(R.id.live_dinamic_feedback_anchor);
            if (findViewById2 != null) {
                ViewProxy.setOnClickListener(findViewById2, new b());
            }
            View findViewById3 = this.mContainer.findViewById(R.id.live_dinamic_feedback_image);
            if (findViewById3 != null) {
                ViewProxy.setOnClickListener(findViewById3, new c());
            }
        }
        return this.mContainer;
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContainer = null;
        this.mData = null;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String str = TAG;
        r0h.b(str, "onError: " + i);
        degrade(i);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String str = TAG;
        r0h.b(str, "onSystemError: " + i);
        degrade(i);
    }

    public void removeParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0b27d5", new Object[]{this});
            return;
        }
        View view = this.mContainer;
        if (view != null && view.getParent() != null) {
            ((ViewGroup) this.mContainer.getParent()).removeView(this.mContainer);
            this.mData = null;
        }
    }

    public void setClickCallback(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3da3702", new Object[]{this, dVar});
        }
    }

    public void setData(DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8557837e", new Object[]{this, dinamicDataObject});
        } else {
            this.mData = dinamicDataObject;
        }
    }

    public void showFeedBackView(Context context, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d8227b", new Object[]{this, context, dXRootView});
        } else if (dXRootView != null) {
            DinamicDataObject dinamicDataObject = (DinamicDataObject) dXRootView.getTag(R.id.live_feedback_tag);
            ViewGroup viewGroup = (ViewGroup) dXRootView.getParent().getParent();
            if (viewGroup != null) {
                removeParent();
                View feedbackView = getFeedbackView(context);
                if (feedbackView != null) {
                    setData(dinamicDataObject);
                    viewGroup.addView(feedbackView, -1);
                    viewGroup.requestLayout();
                }
            }
        }
    }

    public void anchorFeedbackClick(View view) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41eeb8dd", new Object[]{this, view});
            return;
        }
        r0h.a(TAG, "anchor feedback click");
        if (this.mData != null) {
            FeedbackRequest feedbackRequest = new FeedbackRequest();
            feedbackRequest.delReason = LoginConstant.ACCOUNT;
            DinamicDataObject dinamicDataObject = this.mData;
            feedbackRequest.templateName = dinamicDataObject.templateName;
            HashMap<String, JSONObject> hashMap = dinamicDataObject.data;
            String str = "feedreason=account,";
            if (!(hashMap == null || (jSONObject = hashMap.get("data")) == null || jSONObject.get("cardData") == null || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() <= 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("accountInfo");
                if (jSONObject3 != null) {
                    feedbackRequest.anchorIdOrFeedId = jSONObject3.getString("accountId");
                }
                JSONObject jSONObject4 = jSONObject2.getJSONObject("clickMaidian");
                if (jSONObject4 != null) {
                    String string = jSONObject4.getString("name");
                    jSONObject4.getString("pageName");
                    str = str + jSONObject4.getString("params") + ",fb_location=" + string;
                }
            }
            try {
                feedbackRequest.recPos = arq.f(getRecPos(str));
            } catch (Exception e) {
                r0h.c(TAG, "getRecPos exp", e);
            }
            this.mBusiness.a(101, feedbackRequest, FeedbackResponse.class);
        }
    }

    public void imageFeedbackClick(View view) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937ec483", new Object[]{this, view});
            return;
        }
        r0h.a(TAG, "image feedback click");
        if (this.mData != null) {
            FeedbackRequest feedbackRequest = new FeedbackRequest();
            feedbackRequest.delReason = "cover";
            DinamicDataObject dinamicDataObject = this.mData;
            feedbackRequest.templateName = dinamicDataObject.templateName;
            HashMap<String, JSONObject> hashMap = dinamicDataObject.data;
            String str = "feedreason=cover,";
            if (!(hashMap == null || (jSONObject = hashMap.get("data")) == null || jSONObject.get("cardData") == null || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() <= 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("liveInfo");
                if (jSONObject3 != null) {
                    feedbackRequest.anchorIdOrFeedId = jSONObject3.getString("liveId");
                }
                JSONObject jSONObject4 = jSONObject2.getJSONObject("clickMaidian");
                if (jSONObject4 != null) {
                    String string = jSONObject4.getString("name");
                    jSONObject4.getString("pageName");
                    str = str + jSONObject4.getString("params") + ",fb_location=" + string;
                }
            }
            try {
                feedbackRequest.recPos = arq.f(getRecPos(str));
            } catch (Exception e) {
                r0h.c(TAG, "getRecPos exp", e);
            }
            this.mBusiness.a(102, feedbackRequest, FeedbackResponse.class);
        }
    }

    public void liveFeedbackClick(View view) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8e1794", new Object[]{this, view});
            return;
        }
        r0h.a(TAG, "live feedback click");
        if (this.mData != null) {
            FeedbackRequest feedbackRequest = new FeedbackRequest();
            feedbackRequest.delReason = "livehomeAtype";
            DinamicDataObject dinamicDataObject = this.mData;
            feedbackRequest.templateName = dinamicDataObject.templateName;
            HashMap<String, JSONObject> hashMap = dinamicDataObject.data;
            String str = "feedreason=live,";
            if (!(hashMap == null || (jSONObject = hashMap.get("data")) == null || jSONObject.get("cardData") == null || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() <= 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("liveInfo");
                if (jSONObject3 != null) {
                    feedbackRequest.anchorIdOrFeedId = jSONObject3.getString("liveId");
                }
                JSONObject jSONObject4 = jSONObject2.getJSONObject("clickMaidian");
                if (jSONObject4 != null) {
                    String string = jSONObject4.getString("name");
                    jSONObject4.getString("pageName");
                    str = str + jSONObject4.getString("params") + ",fb_location=" + string;
                }
            }
            try {
                feedbackRequest.recPos = arq.f(getRecPos(str));
            } catch (Exception e) {
                r0h.c(TAG, "getRecPos exp", e);
            }
            this.mBusiness.a(100, feedbackRequest, FeedbackResponse.class);
        }
    }

    private void degrade(int i) {
        String str;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4db2d26", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 100) {
            str = "livehomecore";
        } else if (i == 101) {
            str = LoginConstant.ACCOUNT;
        } else {
            str = "cover";
        }
        if (this.mData != null) {
            DinamicDataObject dinamicDataObject = new DinamicDataObject();
            DinamicDataObject dinamicDataObject2 = this.mData;
            dinamicDataObject.mChannelType = dinamicDataObject2.mChannelType;
            dinamicDataObject.mPosition = dinamicDataObject2.mPosition;
            dinamicDataObject.mFeedbackCallback = dinamicDataObject2.mFeedbackCallback;
            StringBuilder sb = new StringBuilder("feedreason=");
            sb.append(str);
            sb.append(",");
            JSONObject degradeData = getDegradeData();
            if (degradeData != null) {
                dinamicDataObject.templateName = degradeData.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                HashMap<String, JSONObject> hashMap = new HashMap<>(1);
                dinamicDataObject.data = hashMap;
                hashMap.put("data", degradeData);
            }
            HashMap<String, JSONObject> hashMap2 = this.mData.data;
            if (!(hashMap2 == null || (jSONObject = hashMap2.get("data")) == null || jSONObject.get("cardData") == null || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() <= 0 || (jSONObject2 = jSONArray.getJSONObject(0)) == null || (jSONObject3 = jSONObject2.getJSONObject("clickMaidian")) == null)) {
                jSONObject3.getString("name");
                jSONObject3.getString("pageName");
                jSONObject3.getString("params");
            }
            DinamicDataObject dinamicDataObject3 = this.mData;
            y5c y5cVar = dinamicDataObject3.mFeedbackCallback;
            if (y5cVar != null) {
                ((HomeMainSecondFragment) y5cVar).u3(dinamicDataObject, dinamicDataObject3.mPosition);
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo instanceof FeedbackResponse) {
            FeedbackResponse.FeedbackData data = ((FeedbackResponse) baseOutDo).getData();
            if (this.mData != null) {
                DinamicDataObject dinamicDataObject = new DinamicDataObject();
                DinamicDataObject dinamicDataObject2 = this.mData;
                dinamicDataObject.mChannelType = dinamicDataObject2.mChannelType;
                dinamicDataObject.mPosition = dinamicDataObject2.mPosition;
                dinamicDataObject.mFeedbackCallback = dinamicDataObject2.mFeedbackCallback;
                dinamicDataObject.uniqueId = dinamicDataObject2.uniqueId;
                if (data.cardList.size() > 0) {
                    dinamicDataObject.templateName = data.cardList.get(0).getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                    HashMap<String, JSONObject> hashMap = new HashMap<>(1);
                    dinamicDataObject.data = hashMap;
                    hashMap.put("data", data.cardList.get(0));
                    DinamicDataObject dinamicDataObject3 = this.mData;
                    y5c y5cVar = dinamicDataObject3.mFeedbackCallback;
                    if (y5cVar != null) {
                        ((HomeMainSecondFragment) y5cVar).u3(dinamicDataObject, dinamicDataObject3.mPosition);
                        return;
                    }
                    return;
                }
                degrade(i);
            }
        }
    }

    private String getRecPos(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e179a55", new Object[]{this, str});
        }
        for (String str2 : str.split(",")) {
            String[] split = str2.split("=");
            if (split.length >= 2 && "recom_pos".equals(split[0])) {
                return split[1];
            }
        }
        return "-1";
    }
}

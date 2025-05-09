package com.alipay.android.app.birdnest.plugin;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.OnUpdateHeightListener;
import com.alipay.android.app.birdnest.api.UniResultViewService;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gcn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UniversalFBPlugin extends AbsFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UniversalFBPlugin";
    private Context mContext;
    private FBPluginCtx mPluginCtx;
    private UniResultViewService mResultViewService;
    private LinearLayout mRootView;
    private String pluginId = "";
    private String className = "";
    private String mReflectType = "service";

    public UniversalFBPlugin(Context context, FBPluginCtx fBPluginCtx, int i) {
        LogUtil.d(TAG, "init", "UniversalFBPlugin create ".concat(String.valueOf(i)));
        this.mContext = context;
        this.mPluginCtx = fBPluginCtx;
    }

    public static /* synthetic */ void access$000(UniversalFBPlugin universalFBPlugin, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62e6874", new Object[]{universalFBPlugin, new Integer(i)});
        } else {
            universalFBPlugin.callJsUpdateHeight(i);
        }
    }

    public static /* synthetic */ FBPluginCtx access$100(UniversalFBPlugin universalFBPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBPluginCtx) ipChange.ipc$dispatch("4f6ce6b9", new Object[]{universalFBPlugin});
        }
        return universalFBPlugin.mPluginCtx;
    }

    private void callJsUpdateHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e8e885", new Object[]{this, new Integer(i)});
        } else if (!TextUtils.isEmpty(this.pluginId) && this.mResultViewService != null && this.mPluginCtx != null) {
            LogUtil.d(TAG, "callJsUpdateHeight", "callJsUpdateHeight height = ".concat(String.valueOf(i)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", (Object) Integer.valueOf(i));
            jSONObject.put(gcn.PLUGIN_ID, (Object) this.pluginId);
            final String str = "updateNativeViewHeight&&updateNativeViewHeight('" + toJsJsonString(jSONObject.toString()) + "')";
            ((Activity) this.mContext).runOnUiThread(new Runnable() { // from class: com.alipay.android.app.birdnest.plugin.UniversalFBPlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LogUtil.d(UniversalFBPlugin.TAG, "callJsUpdateHeight", "callJsUpdateHeight Js exec result = ".concat(String.valueOf(UniversalFBPlugin.access$100(UniversalFBPlugin.this).nativeExecuteJs(str))));
                    }
                }
            });
        }
    }

    private static int convertPixelsToDp(float f, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9045ce49", new Object[]{new Float(f), context})).intValue();
        }
        return (int) (f / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    private UniResultViewService getCommonView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UniResultViewService) ipChange.ipc$dispatch("cc3f4d7d", new Object[]{this, str});
        }
        LogUtil.d(TAG, "getCommonView", "className: ".concat(String.valueOf(str)));
        Object findUniService = PhoneCashierMspEngine.getMspUtils().findUniService(str, this.mReflectType);
        UniResultViewService uniResultViewService = findUniService instanceof UniResultViewService ? (UniResultViewService) findUniService : null;
        if (uniResultViewService == null) {
            LogUtil.d(TAG, "getCommonView", "service == null");
        }
        return uniResultViewService;
    }

    public static /* synthetic */ Object ipc$super(UniversalFBPlugin universalFBPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/birdnest/plugin/UniversalFBPlugin");
    }

    private String toJsJsonString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8070a032", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\u2028", "\\u2028").replace("\u2029", "\\u2029");
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.mRootView = linearLayout;
        linearLayout.setOrientation(1);
        this.mRootView.setLayoutParams(new LinearLayout.LayoutParams(-1, 50));
        return this.mRootView;
    }

    private void updateView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a8b71f", new Object[]{this, str});
        } else if (this.mResultViewService == null) {
            this.mResultViewService = getCommonView(this.className);
            LogUtil.d(TAG, "updateView", "getCommonView null : " + this.className);
            UniResultViewService uniResultViewService = this.mResultViewService;
            if (uniResultViewService != null) {
                try {
                    uniResultViewService.setOnUpdateHeightListener(new OnUpdateHeightListener() { // from class: com.alipay.android.app.birdnest.plugin.UniversalFBPlugin.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.birdnest.api.OnUpdateHeightListener
                        public void onUpdateHeight(int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("a07a1ed", new Object[]{this, new Integer(i)});
                            } else {
                                UniversalFBPlugin.access$000(UniversalFBPlugin.this, i);
                            }
                        }
                    });
                    View createView = this.mResultViewService.createView(str, this.mContext);
                    if (createView != null) {
                        createView.measure(0, 0);
                        this.mRootView.removeAllViews();
                        this.mRootView.addView(createView, -1, new ViewGroup.LayoutParams(-1, -2));
                        this.mRootView.measure(0, 0);
                        callJsUpdateHeight(convertPixelsToDp(this.mRootView.getMeasuredHeight(), this.mContext));
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(TAG, "updateView", e);
                }
            }
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals("src")) {
            JSONObject parseObject = JSON.parseObject(str2);
            this.pluginId = parseObject.getString(gcn.PLUGIN_ID);
            this.className = parseObject.getString("class");
            this.mReflectType = parseObject.getString("type");
            String string = parseObject.getString("data");
            if (!parseObject.getBooleanValue("finishPlugin") || this.mResultViewService == null) {
                updateView(string);
            } else {
                this.mResultViewService = null;
                LinearLayout linearLayout = this.mRootView;
                if (linearLayout != null) {
                    linearLayout.removeAllViews();
                    this.mRootView = null;
                }
            }
        }
        return true;
    }
}

package com.alibaba.aliweex.hc.bundle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.utils.WXLogUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cvw;
import tb.euw;
import tb.fzc;
import tb.kr0;
import tb.otw;
import tb.t2o;
import tb.wtw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class WXHCNavBarAdapter extends cvw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_WEEX_HC = "group_weex_hc";
    public static final String CONFIG_KEY_WEEX_MAIN_HC_DOMAIN = "weex_main_hc_domain";
    private static final String TAG = "WXNavBarAdapter";
    public static String CLICK_LEFT_ITEM = "clickleftitem";
    public static String CLICK_RIGHT_ITEM = "clickrightitem";
    public static String CLICK_MORE_ITEM = "clickmoreitem";
    public static String CLICK_CENTER_ITEM = "clickcenteritem";
    private otw menuItemRight = null;
    private otw menuItemTitle = null;
    private List<otw> menuItemList = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum NavigatorType {
        TITLE,
        MORE_ITEM,
        CLEAR_MORE_ITEM,
        RIGHT_ITEM,
        CLEAR_RIGHT_ITEM;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NavigatorType navigatorType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/hc/bundle/WXHCNavBarAdapter$NavigatorType");
        }

        public static NavigatorType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NavigatorType) ipChange.ipc$dispatch("30359ea4", new Object[]{str});
            }
            return (NavigatorType) Enum.valueOf(NavigatorType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$aliweex$hc$bundle$WXHCNavBarAdapter$NavigatorType;

        static {
            int[] iArr = new int[NavigatorType.values().length];
            $SwitchMap$com$alibaba$aliweex$hc$bundle$WXHCNavBarAdapter$NavigatorType = iArr;
            try {
                iArr[NavigatorType.RIGHT_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$aliweex$hc$bundle$WXHCNavBarAdapter$NavigatorType[NavigatorType.CLEAR_RIGHT_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$aliweex$hc$bundle$WXHCNavBarAdapter$NavigatorType[NavigatorType.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(773849090);
    }

    public WXHCNavBarAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    private boolean checkScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539713a2", new Object[]{this, str})).booleanValue();
        }
        String scheme = Uri.parse(str).getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String lowerCase = scheme.toLowerCase();
            if (lowerCase.equals("http") || lowerCase.equals("https") || lowerCase.equals("data") || lowerCase.equals("local")) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(WXHCNavBarAdapter wXHCNavBarAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/hc/bundle/WXHCNavBarAdapter");
    }

    private boolean setNavBarMoreItem(String str, fzc.a aVar) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90d3ee38", new Object[]{this, str, aVar})).booleanValue();
        }
        if (shouldSetNavigator(NavigatorType.MORE_ITEM) && !TextUtils.isEmpty(str)) {
            try {
                List<otw> list = this.menuItemList;
                if (list == null) {
                    this.menuItemList = new ArrayList();
                } else {
                    list.clear();
                }
                if (aVar != null) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.length() == 0) {
                        clearNavBarMoreItem("");
                        return true;
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("items");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        otw otwVar = new otw();
                        otwVar.h = aVar;
                        String str4 = null;
                        if (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
                            str3 = null;
                            str2 = null;
                        } else {
                            str4 = jSONObject.optString("icon");
                            str3 = jSONObject.optString("title");
                            str2 = jSONObject.optString("iconFontName");
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            otwVar.e = str4;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            otwVar.d(getFragmentActivity(), str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            otwVar.f(str3);
                        }
                        Intent intent = new Intent();
                        otwVar.f = intent;
                        intent.putExtra("index", 0);
                        this.menuItemList.add(otwVar);
                        getFragmentActivity().supportInvalidateOptionsMenu();
                        return true;
                    }
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String string = jSONObject2.getString("title");
                        String string2 = jSONObject2.getString("icon");
                        otw otwVar2 = new otw();
                        otwVar2.h = aVar;
                        Intent intent2 = new Intent();
                        otwVar2.f = intent2;
                        intent2.putExtra("index", i);
                        if (!TextUtils.isEmpty(string2)) {
                            otwVar2.e = string2;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            otwVar2.f(string);
                        }
                        if (!checkScheme(otwVar2.e)) {
                            return false;
                        }
                        this.menuItemList.add(otwVar2);
                    }
                    getFragmentActivity().supportInvalidateOptionsMenu();
                    return true;
                }
                JSONObject jSONObject3 = new JSONObject(str);
                if (jSONObject3.length() == 0) {
                    clearNavBarMoreItem("");
                    return true;
                }
                JSONArray jSONArray = jSONObject3.getJSONArray("items");
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                        otw otwVar3 = new otw();
                        String string3 = jSONObject4.getString("text");
                        if (!TextUtils.isEmpty(string3)) {
                            otwVar3.d = string3;
                            boolean optBoolean = jSONObject4.optBoolean("fromNative", false);
                            boolean optBoolean2 = jSONObject4.optBoolean("iconFont", false);
                            String optString = jSONObject4.optString("icon");
                            if (!optBoolean) {
                                otwVar3.c(optString, wtw.a(getFragmentActivity()));
                            } else if (optBoolean2) {
                                otwVar3.d(getFragmentActivity(), optString);
                            } else {
                                otwVar3.e(optString);
                            }
                            Intent intent3 = new Intent();
                            otwVar3.f = intent3;
                            intent3.putExtra("index", i2);
                            this.menuItemList.add(otwVar3);
                        }
                    }
                }
                getFragmentActivity().supportInvalidateOptionsMenu();
                return true;
            } catch (Exception e) {
                WXLogUtils.e("WebAppInterface", "setNavBarRightItem: param parse to JSON error, param=" + e.getMessage());
            }
        }
        return false;
    }

    private boolean shouldSetNavigator(NavigatorType navigatorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dadcab0", new Object[]{this, navigatorType})).booleanValue();
        }
        int i = a.$SwitchMap$com$alibaba$aliweex$hc$bundle$WXHCNavBarAdapter$NavigatorType[navigatorType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return shouldSetNavigator();
        }
        return true;
    }

    @Override // tb.heb
    public boolean clearNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd47acc", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean clearNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bac709a", new Object[]{this, str})).booleanValue();
        }
        if (!shouldSetNavigator(NavigatorType.CLEAR_MORE_ITEM)) {
            return false;
        }
        List<otw> list = this.menuItemList;
        if (list == null) {
            this.menuItemList = new ArrayList();
        } else {
            list.clear();
        }
        getFragmentActivity().supportInvalidateOptionsMenu();
        return false;
    }

    @Override // tb.heb
    public boolean clearNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43b81447", new Object[]{this, str})).booleanValue();
        }
        if (!shouldSetNavigator(NavigatorType.CLEAR_RIGHT_ITEM)) {
            return false;
        }
        this.menuItemRight = null;
        getFragmentActivity().supportInvalidateOptionsMenu();
        return true;
    }

    @Override // tb.cvw
    public void destroy() {
        Bitmap bitmap;
        Bitmap bitmap2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        otw otwVar = this.menuItemTitle;
        if (!(otwVar == null || (bitmap2 = otwVar.c) == null)) {
            bitmap2.recycle();
            this.menuItemTitle = null;
        }
        otw otwVar2 = this.menuItemRight;
        if (!(otwVar2 == null || (bitmap = otwVar2.c) == null)) {
            bitmap.recycle();
            this.menuItemRight = null;
        }
        List<otw> list = this.menuItemList;
        if (list != null && list.size() > 0) {
            for (otw otwVar3 : this.menuItemList) {
                Bitmap bitmap3 = otwVar3.c;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                }
            }
            this.menuItemList = null;
        }
    }

    public List<otw> getMenuItemMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3613e5c3", new Object[]{this});
        }
        return this.menuItemList;
    }

    public otw getMenuItemRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otw) ipChange.ipc$dispatch("4bbf6388", new Object[]{this});
        }
        return this.menuItemRight;
    }

    public otw getMenuItemTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otw) ipChange.ipc$dispatch("ee97bec4", new Object[]{this});
        }
        return this.menuItemTitle;
    }

    public WeexPageFragment getWeexPageFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexPageFragment) ipChange.ipc$dispatch("3b1eded2", new Object[]{this});
        }
        Fragment findFragmentByTag = getFragmentActivity().getSupportFragmentManager().findFragmentByTag(WeexPageFragment.FRAGMENT_TAG);
        if (findFragmentByTag == null || !(findFragmentByTag instanceof WeexPageFragment)) {
            return null;
        }
        return (WeexPageFragment) findFragmentByTag;
    }

    @Override // tb.cvw
    public abstract void push(Activity activity, String str, JSONObject jSONObject);

    @Override // tb.fzc
    public euw setLeftItem(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject, fzc.a aVar) {
        WeexPageFragment weexPageFragment;
        FragmentManager supportFragmentManager;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("ef33ff15", new Object[]{this, wXSDKInstance, jSONObject, aVar});
        }
        boolean navBarLeftItem = setNavBarLeftItem(jSONObject.toJSONString());
        if (getFragmentActivity() == null || (supportFragmentManager = getFragmentActivity().getSupportFragmentManager()) == null) {
            weexPageFragment = null;
        } else {
            weexPageFragment = (WeexPageFragment) supportFragmentManager.findFragmentByTag(WeexPageFragment.FRAGMENT_TAG);
        }
        if (navBarLeftItem || weexPageFragment == null) {
            z = navBarLeftItem;
        } else if (jSONObject.size() > 0) {
            weexPageFragment.setBackPressedListener(aVar);
        } else {
            weexPageFragment.setBackPressedListener(null);
        }
        if (z) {
            return null;
        }
        euw euwVar = new euw();
        euwVar.f18829a = "WX_ERROR";
        return euwVar;
    }

    @Override // tb.fzc
    public euw setMoreItem(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject, fzc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("7b604187", new Object[]{this, wXSDKInstance, jSONObject, aVar});
        }
        if (setNavBarMoreItem(jSONObject.toJSONString(), aVar)) {
            return null;
        }
        euw euwVar = new euw();
        euwVar.f18829a = "WX_ERROR";
        return euwVar;
    }

    @Override // tb.heb
    public boolean setNavBarLeftItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e9da61", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.heb
    public boolean setNavBarRightItem(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be4ea752", new Object[]{this, str})).booleanValue() : setNavBarRightItem(str, null);
    }

    @Override // tb.fzc
    public euw setRightItem(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject, fzc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("8e174be4", new Object[]{this, wXSDKInstance, jSONObject, aVar});
        }
        if (setNavBarRightItem(jSONObject.toJSONString(), aVar)) {
            return null;
        }
        euw euwVar = new euw();
        euwVar.f18829a = "WX_ERROR";
        return euwVar;
    }

    @Override // tb.fzc
    public euw setTitle(WXSDKInstance wXSDKInstance, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("3dfd7da", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (!shouldSetNavigator(NavigatorType.TITLE)) {
            euw euwVar = new euw();
            euwVar.f18829a = "WX_FAILED";
            euwVar.b = "can not set Navigator";
            return euwVar;
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("icon");
        this.menuItemTitle = new otw();
        if (!TextUtils.isEmpty(string2)) {
            if (!checkScheme(string2)) {
                euw euwVar2 = new euw();
                euwVar2.f18829a = "WX_FAILED";
                euwVar2.b = "schemeerror";
                return euwVar2;
            }
            this.menuItemTitle.e = string2;
            getFragmentActivity().supportInvalidateOptionsMenu();
            return null;
        } else if (!TextUtils.isEmpty(string)) {
            this.menuItemTitle.d = string;
            getFragmentActivity().supportInvalidateOptionsMenu();
            return null;
        } else {
            euw euwVar3 = new euw();
            euwVar3.f18829a = "WX_FAILED";
            euwVar3.b = "paramerror";
            return euwVar3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
        if (r7.menuItemRight.d(getFragmentActivity(), r8) >= 0) goto L_0x00fd;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setNavBarRightItem(java.lang.String r8, tb.fzc.a r9) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.setNavBarRightItem(java.lang.String, tb.fzc$a):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #0 {Exception -> 0x005a, blocks: (B:11:0x002e, B:13:0x004c, B:16:0x005d, B:18:0x0063, B:20:0x006b, B:22:0x007c, B:25:0x0083, B:27:0x0094, B:29:0x009a, B:32:0x00a5, B:34:0x00ad, B:37:0x00b4, B:39:0x00bc, B:40:0x00ca, B:42:0x00d2, B:45:0x00d8), top: B:50:0x002e }] */
    @Override // tb.heb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setNavBarTitle(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "icon"
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001f
            java.lang.String r2 = "832309b"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r2, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001f:
            com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter$NavigatorType r3 = com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.NavigatorType.TITLE
            boolean r3 = r6.shouldSetNavigator(r3)
            if (r3 != 0) goto L_0x0028
            return r1
        L_0x0028:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L_0x00ec
            java.lang.String r3 = "utf-8"
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r3)     // Catch: Exception -> 0x005a
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: Exception -> 0x005a
            r3.<init>(r7)     // Catch: Exception -> 0x005a
            tb.otw r7 = new tb.otw     // Catch: Exception -> 0x005a
            r7.<init>()     // Catch: Exception -> 0x005a
            java.lang.String r4 = "title"
            java.lang.String r4 = r3.optString(r4)     // Catch: Exception -> 0x005a
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: Exception -> 0x005a
            if (r5 != 0) goto L_0x005d
            r7.f(r4)     // Catch: Exception -> 0x005a
            r6.menuItemTitle = r7     // Catch: Exception -> 0x005a
            androidx.fragment.app.FragmentActivity r7 = r6.getFragmentActivity()     // Catch: Exception -> 0x005a
            r7.supportInvalidateOptionsMenu()     // Catch: Exception -> 0x005a
            goto L_0x00e1
        L_0x005a:
            r7 = move-exception
            goto L_0x00e3
        L_0x005d:
            boolean r4 = r3.has(r2)     // Catch: Exception -> 0x005a
            if (r4 != 0) goto L_0x006b
            java.lang.String r0 = " "
            r7.f(r0)     // Catch: Exception -> 0x005a
            r6.menuItemTitle = r7     // Catch: Exception -> 0x005a
            return r1
        L_0x006b:
            java.lang.String r2 = r3.optString(r2)     // Catch: Exception -> 0x005a
            java.lang.String r4 = "iconType"
            java.lang.String r4 = r3.optString(r4)     // Catch: Exception -> 0x005a
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: Exception -> 0x005a
            if (r5 != 0) goto L_0x00e2
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: Exception -> 0x005a
            if (r5 == 0) goto L_0x0083
            goto L_0x00e2
        L_0x0083:
            java.lang.String r5 = "stretch"
            boolean r3 = r3.optBoolean(r5)     // Catch: Exception -> 0x005a
            r7.g = r3     // Catch: Exception -> 0x005a
            java.lang.String r3 = "IconFont"
            boolean r3 = r4.equals(r3)     // Catch: Exception -> 0x005a
            if (r3 == 0) goto L_0x00a5
            androidx.fragment.app.FragmentActivity r3 = r6.getFragmentActivity()     // Catch: Exception -> 0x005a
            if (r3 == 0) goto L_0x00a5
            androidx.fragment.app.FragmentActivity r3 = r6.getFragmentActivity()     // Catch: Exception -> 0x005a
            int r2 = r7.d(r3, r2)     // Catch: Exception -> 0x005a
            if (r2 < 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00a5:
            java.lang.String r3 = "Native"
            boolean r3 = r4.equals(r3)     // Catch: Exception -> 0x005a
            if (r3 == 0) goto L_0x00b4
            int r2 = r7.e(r2)     // Catch: Exception -> 0x005a
            if (r2 < 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00b4:
            java.lang.String r3 = "Base64"
            boolean r3 = r4.equals(r3)     // Catch: Exception -> 0x005a
            if (r3 == 0) goto L_0x00ca
            androidx.fragment.app.FragmentActivity r0 = r6.getFragmentActivity()     // Catch: Exception -> 0x005a
            int r0 = tb.wtw.a(r0)     // Catch: Exception -> 0x005a
            float r0 = (float) r0     // Catch: Exception -> 0x005a
            boolean r0 = r7.c(r2, r0)     // Catch: Exception -> 0x005a
            goto L_0x00d6
        L_0x00ca:
            java.lang.String r3 = "URL"
            boolean r3 = r4.equals(r3)     // Catch: Exception -> 0x005a
            if (r3 == 0) goto L_0x00d5
            r7.e = r2     // Catch: Exception -> 0x005a
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            if (r0 == 0) goto L_0x00e1
            r6.menuItemTitle = r7     // Catch: Exception -> 0x005a
            androidx.fragment.app.FragmentActivity r7 = r6.getFragmentActivity()     // Catch: Exception -> 0x005a
            r7.supportInvalidateOptionsMenu()     // Catch: Exception -> 0x005a
        L_0x00e1:
            return r0
        L_0x00e2:
            return r1
        L_0x00e3:
            java.lang.String r0 = "WXNavBarAdapter"
            java.lang.String r7 = com.taobao.weex.utils.WXLogUtils.getStackTrace(r7)
            com.taobao.weex.utils.WXLogUtils.e(r0, r7)
        L_0x00ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter.setNavBarTitle(java.lang.String):boolean");
    }

    public boolean shouldSetNavigator() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823b61f3", new Object[]{this})).booleanValue();
        }
        try {
            String config = kr0.e().b().getConfig("group_weex_hc", "weex_main_hc_domain", "");
            if (!TextUtils.isEmpty(config)) {
                for (String str : config.split(",")) {
                    String originalUrl = getWeexPageFragment().getOriginalUrl();
                    if (!TextUtils.isEmpty(originalUrl) && originalUrl.contains(str)) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override // tb.heb
    public boolean setNavBarMoreItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c1d02f", new Object[]{this, str})).booleanValue();
        }
        if (shouldSetNavigator(NavigatorType.MORE_ITEM) && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("items");
                if (jSONArray != null && jSONArray.length() > 0) {
                    clearNavBarMoreItem("");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        otw otwVar = new otw();
                        String string = jSONObject.getString("text");
                        if (!TextUtils.isEmpty(string)) {
                            otwVar.d = string;
                            boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                            boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                            String optString = jSONObject.optString("icon");
                            if (!optBoolean) {
                                otwVar.c(optString, wtw.a(getFragmentActivity()));
                            } else if (!optBoolean2 || getFragmentActivity() == null) {
                                otwVar.e(optString);
                            } else {
                                otwVar.d(getFragmentActivity(), optString);
                            }
                            Intent intent = new Intent();
                            otwVar.f = intent;
                            intent.putExtra("index", i);
                            if (this.menuItemList == null) {
                                this.menuItemList = new ArrayList();
                            }
                            this.menuItemList.add(otwVar);
                        }
                    }
                }
                getFragmentActivity().supportInvalidateOptionsMenu();
                return true;
            } catch (Exception unused) {
                WXLogUtils.d("WXActivity", "setNavBarMoreItem: param decode error param=" + str);
            }
        }
        return false;
    }
}

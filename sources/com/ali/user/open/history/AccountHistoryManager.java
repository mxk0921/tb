package com.ali.user.open.history;

import android.text.TextUtils;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.service.StorageService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AccountHistoryManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HISTORY_LOGIN_ACCOUNTS = "tb_history_acounts";
    private static volatile AccountHistoryManager singleton;

    private AccountHistoryManager() {
    }

    public static AccountHistoryManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountHistoryManager) ipChange.ipc$dispatch("e001cd38", new Object[0]);
        }
        if (singleton == null) {
            synchronized (AccountHistoryManager.class) {
                try {
                    if (singleton == null) {
                        singleton = new AccountHistoryManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return singleton;
    }

    private String toJSONString(List<HistoryAccount> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bb770d4", new Object[]{this, list});
        }
        if (list == null || list.size() <= 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        for (HistoryAccount historyAccount : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("userId", historyAccount.userId);
                jSONObject.put("tokenKey", historyAccount.tokenKey);
                jSONObject.put("nick", historyAccount.nick);
                jSONObject.put("email", historyAccount.email);
                jSONObject.put("mobile", historyAccount.mobile);
                jSONObject.put("t", String.valueOf(System.currentTimeMillis()));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }
        return jSONArray.toString();
    }

    public void clearHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3c682d", new Object[]{this});
        } else {
            ((StorageService) AliMemberSDK.getService(StorageService.class)).removeDDpExValue(HISTORY_LOGIN_ACCOUNTS);
        }
    }

    public HistoryAccount findHistoryAccount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("c3e3e78e", new Object[]{this, str});
        }
        try {
            List<HistoryAccount> historyAccounts = getHistoryAccounts();
            if (historyAccounts != null) {
                for (HistoryAccount historyAccount : historyAccounts) {
                    String str2 = historyAccount.userId;
                    if (str2 != null && str2.equals(str)) {
                        return historyAccount;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public List<HistoryAccount> getHistoryAccounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17c249fc", new Object[]{this});
        }
        String dDpExValue = ((StorageService) AliMemberSDK.getService(StorageService.class)).getDDpExValue(HISTORY_LOGIN_ACCOUNTS);
        if (TextUtils.isEmpty(dDpExValue)) {
            return new ArrayList();
        }
        try {
            return parseObject(dDpExValue);
        } catch (JSONException unused) {
            ArrayList arrayList = new ArrayList();
            ((StorageService) AliMemberSDK.getService(StorageService.class)).removeDDpExValue(HISTORY_LOGIN_ACCOUNTS);
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ali.user.open.history.HistoryAccount matchHistoryAccount(java.lang.String r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.ali.user.open.history.AccountHistoryManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "e1c85702"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            com.ali.user.open.history.HistoryAccount r5 = (com.ali.user.open.history.HistoryAccount) r5
            return r5
        L_0x0018:
            java.util.List r0 = r4.getHistoryAccounts()
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.ali.user.open.history.HistoryAccount r1 = (com.ali.user.open.history.HistoryAccount) r1
            java.lang.String r2 = r1.nick
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = r1.email
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = r1.mobile
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 == 0) goto L_0x0022
        L_0x0046:
            return r1
        L_0x0047:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.open.history.AccountHistoryManager.matchHistoryAccount(java.lang.String):com.ali.user.open.history.HistoryAccount");
    }

    public void putLoginHistory(HistoryAccount historyAccount, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376f2ae6", new Object[]{this, historyAccount, str});
        } else if (!ConfigManager.getInstance().isSaveHistoryWithSalt() || ((StorageService) AliMemberSDK.getService(StorageService.class)).saveSafeToken(historyAccount.tokenKey, str)) {
            List<HistoryAccount> historyAccounts = getHistoryAccounts();
            if (historyAccounts != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(historyAccount);
                for (HistoryAccount historyAccount2 : historyAccounts) {
                    if (arrayList.size() >= ConfigManager.getInstance().getMaxHistoryAccount()) {
                        break;
                    } else if (TextUtils.isEmpty(historyAccount2.userId) || !historyAccount2.userId.equals(historyAccount.userId)) {
                        arrayList.add(historyAccount2);
                    }
                }
                ((StorageService) AliMemberSDK.getService(StorageService.class)).putDDpExValue(HISTORY_LOGIN_ACCOUNTS, toJSONString(arrayList));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(historyAccount);
            ((StorageService) AliMemberSDK.getService(StorageService.class)).putDDpExValue(HISTORY_LOGIN_ACCOUNTS, toJSONString(arrayList2));
        }
    }

    public void removeHistoryAccount(HistoryAccount historyAccount) {
        ArrayList arrayList;
        String dDpExValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168ec1df", new Object[]{this, historyAccount});
        } else if (historyAccount != null) {
            try {
                ((StorageService) AliMemberSDK.getService(StorageService.class)).removeSafeToken(historyAccount.tokenKey);
                try {
                    dDpExValue = ((StorageService) AliMemberSDK.getService(StorageService.class)).getDDpExValue(HISTORY_LOGIN_ACCOUNTS);
                } catch (Exception unused) {
                }
                try {
                    if (TextUtils.isEmpty(dDpExValue)) {
                        arrayList = new ArrayList();
                    } else {
                        arrayList = parseObject(dDpExValue);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    arrayList = new ArrayList();
                    ((StorageService) AliMemberSDK.getService(StorageService.class)).removeDDpExValue(HISTORY_LOGIN_ACCOUNTS);
                }
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (HistoryAccount historyAccount2 : arrayList) {
                        if (!historyAccount2.userId.equals(historyAccount.userId)) {
                            arrayList2.add(historyAccount2);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList == null) {
                    return;
                }
                if (arrayList.isEmpty()) {
                    ((StorageService) AliMemberSDK.getService(StorageService.class)).removeDDpExValue(HISTORY_LOGIN_ACCOUNTS);
                } else {
                    ((StorageService) AliMemberSDK.getService(StorageService.class)).putDDpExValue(HISTORY_LOGIN_ACCOUNTS, toJSONString(arrayList));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private List<HistoryAccount> parseObject(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ab74704", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                HistoryAccount historyAccount = new HistoryAccount();
                historyAccount.userId = jSONObject.optString("userId");
                historyAccount.tokenKey = jSONObject.optString("tokenKey");
                historyAccount.mobile = jSONObject.optString("mobile");
                historyAccount.nick = jSONObject.optString("nick");
                historyAccount.email = jSONObject.optString("email");
                historyAccount.t = jSONObject.optString("t");
                arrayList.add(historyAccount);
            }
        }
        return arrayList;
    }
}

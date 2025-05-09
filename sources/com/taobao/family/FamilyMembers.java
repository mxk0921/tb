package com.taobao.family;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FamilyMembers implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVITE_ME = "inviteMe";
    public static final String MY_INVITE = "myInvite";
    public static final int ROLE_ID_DAUGHTER = 10;
    public static final int ROLE_ID_FATHER = 1;
    public static final int ROLE_ID_GONGGONG = 3;
    public static final int ROLE_ID_HUSBAND = 7;
    public static final int ROLE_ID_MOTHER = 2;
    public static final int ROLE_ID_POPO = 4;
    public static final int ROLE_ID_SON = 9;
    public static final int ROLE_ID_WIFE = 8;
    public static final int ROLE_ID_YUEFU = 5;
    public static final int ROLE_ID_YUEMU = 6;
    public List<FamilyMember> invitees;
    public List<FamilyMember> inviters;
    public JSONObject jsonObject;

    public FamilyMembers() {
        this.inviters = new ArrayList();
        this.invitees = new ArrayList();
        this.jsonObject = new JSONObject();
    }

    public List<FamilyMember> getBubbleDisplayList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38cf4682", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (FamilyMember familyMember : this.invitees) {
            if (familyMember.globalBubbleShowType == 1) {
                arrayList.add(familyMember);
            }
        }
        for (FamilyMember familyMember2 : this.inviters) {
            if (familyMember2.globalBubbleShowType == 1) {
                arrayList.add(familyMember2);
            }
        }
        return arrayList;
    }

    public String getOrderString() {
        JSONObject jSONObject;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66a2ed0", new Object[]{this});
        }
        try {
            jSONObject = new JSONObject();
            try {
                for (FamilyMember familyMember : this.inviters) {
                    jSONObject.put(familyMember.userId, familyMember.remarkName);
                }
                for (FamilyMember familyMember2 : this.invitees) {
                    jSONObject.put(familyMember2.userId, familyMember2.remarkName);
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return jSONObject == null ? null : null;
            }
        } catch (Exception e3) {
            e = e3;
            jSONObject = null;
        }
        if (jSONObject == null && jSONObject.length() > 0) {
            return jSONObject.toString();
        }
    }

    public List<FamilyMember> getRelationShip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bfec5352", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (FamilyMember familyMember : this.inviters) {
            int i = familyMember.roleId;
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                arrayList.add(familyMember);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isOldPeople() {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.family.FamilyMembers.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "17967417"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            java.util.List<com.taobao.family.FamilyMember> r2 = r5.inviters
            java.util.Iterator r2 = r2.iterator()
        L_0x001f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r2.next()
            com.taobao.family.FamilyMember r3 = (com.taobao.family.FamilyMember) r3
            int r3 = r3.roleId
            if (r3 == r1) goto L_0x003e
            r4 = 2
            if (r3 == r4) goto L_0x003e
            r4 = 3
            if (r3 == r4) goto L_0x003e
            r4 = 4
            if (r3 == r4) goto L_0x003e
            r4 = 5
            if (r3 == r4) goto L_0x003e
            r4 = 6
            if (r3 != r4) goto L_0x001f
        L_0x003e:
            return r1
        L_0x003f:
            java.util.List<com.taobao.family.FamilyMember> r2 = r5.invitees
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r2.next()
            com.taobao.family.FamilyMember r3 = (com.taobao.family.FamilyMember) r3
            int r3 = r3.roleId
            r4 = 9
            if (r3 == r4) goto L_0x005b
            r4 = 10
            if (r3 != r4) goto L_0x0045
        L_0x005b:
            return r1
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.family.FamilyMembers.isOldPeople():boolean");
    }

    public FamilyMembers(JSONObject jSONObject) {
        this.inviters = new ArrayList();
        this.invitees = new ArrayList();
        this.jsonObject = new JSONObject();
        if (jSONObject != null) {
            this.jsonObject = jSONObject;
            JSONArray optJSONArray = jSONObject.optJSONArray(INVITE_ME);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.inviters.add(new FamilyMember(optJSONObject));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(MY_INVITE);
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        this.invitees.add(new FamilyMember(optJSONObject2));
                    }
                }
            }
        }
    }
}

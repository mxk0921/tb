package com.taobao.mediaplay.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PlayerQualityItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean current;
    public String definition;
    public int index;
    public String name;
    public String newDefinition;
    public String newName;

    static {
        t2o.a(774897779);
    }

    public static PlayerQualityItem create(String str, String str2, String str3, String str4, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PlayerQualityItem) ipChange.ipc$dispatch("a87cfdac", new Object[]{str, str2, str3, str4, new Integer(i)});
        }
        PlayerQualityItem playerQualityItem = new PlayerQualityItem();
        playerQualityItem.name = str;
        playerQualityItem.newName = str2;
        playerQualityItem.definition = str3;
        playerQualityItem.newDefinition = str4;
        playerQualityItem.index = i;
        return playerQualityItem;
    }

    public boolean equals(PlayerQualityItem playerQualityItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cc0a758", new Object[]{this, playerQualityItem})).booleanValue();
        }
        if (playerQualityItem == null || TextUtils.isEmpty(playerQualityItem.name) || TextUtils.isEmpty(playerQualityItem.newName) || TextUtils.isEmpty(playerQualityItem.definition) || TextUtils.isEmpty(playerQualityItem.newDefinition) || !playerQualityItem.name.equals(this.name) || !playerQualityItem.newName.equals(this.newName) || !playerQualityItem.newDefinition.equals(this.definition) || !playerQualityItem.newDefinition.equals(this.newDefinition)) {
            return false;
        }
        return true;
    }
}

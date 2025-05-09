package com.taobao.browser.jsbridge.ui.chooseImg;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FileTraversal implements Parcelable {
    public static final Parcelable.Creator<FileTraversal> CREATOR = new Parcelable.Creator<FileTraversal>() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.FileTraversal.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileTraversal[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FileTraversal[]) ipChange.ipc$dispatch("732ebdb0", new Object[]{this, new Integer(i)});
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileTraversal createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FileTraversal) ipChange.ipc$dispatch("cdc2a1c7", new Object[]{this, parcel});
            }
            FileTraversal fileTraversal = new FileTraversal();
            fileTraversal.fileName = parcel.readString();
            fileTraversal.fileContent = parcel.readArrayList(FileTraversal.class.getClassLoader());
            return fileTraversal;
        }
    };
    public List<String> fileContent = new ArrayList();
    public String fileName;

    static {
        t2o.a(619708593);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fileName);
        parcel.writeList(this.fileContent);
    }
}

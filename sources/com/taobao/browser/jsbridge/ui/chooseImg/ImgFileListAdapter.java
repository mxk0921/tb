package com.taobao.browser.jsbridge.ui.chooseImg;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.t2o;
import tb.v4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImgFileListAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public String fileCount = v4s.PARAM_UPLOAD_FILE_COUNT;
    public String fileName = "fileName";
    public String imgPath = "imgPath";
    public List<HashMap<String, String>> listData;
    public ImgChooseUtils util;

    static {
        t2o.a(619708601);
    }

    public ImgFileListAdapter(Context context, List<HashMap<String, String>> list) {
        this.context = context;
        this.listData = list;
        this.util = new ImgChooseUtils(context);
    }

    public static /* synthetic */ Object ipc$super(ImgFileListAdapter imgFileListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/chooseImg/ImgFileListAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.listData.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.listData.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        ImgHolder imgHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            imgHolder = new ImgHolder();
            view2 = LayoutInflater.from(this.context).inflate(R.layout.camera_imgfileadapter, (ViewGroup) null);
            imgHolder.imageView = (ImageView) view2.findViewById(R.id.filePhoto_imgview);
            imgHolder.fileName_textView = (TextView) view2.findViewById(R.id.fileName_textview);
            view2.setTag(imgHolder);
        } else {
            view2 = view;
            imgHolder = (ImgHolder) view.getTag();
        }
        TextView textView = imgHolder.fileName_textView;
        textView.setText(this.listData.get(i).get(this.fileName) + this.listData.get(i).get(this.fileCount));
        imgHolder.imageView.setImageResource(R.drawable.camera_pictures_no);
        this.util.imgExcute(imgHolder, new ImgCallBack() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.ImgFileListAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.browser.jsbridge.ui.chooseImg.ImgCallBack
            public void resultImgCall(ImageView imageView, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ff219569", new Object[]{this, imageView, bitmap});
                } else {
                    imageView.setImageBitmap(bitmap);
                }
            }
        }, this.listData.get(i).get(this.imgPath));
        return view2;
    }
}

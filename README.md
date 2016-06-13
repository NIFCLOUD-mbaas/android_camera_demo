# �yAndroid�z�A�v���Ƀt�@�C���X�g�A�@�\�����悤�I

## �T�v

* �����Android�ŁA�t�@�C���X�g�A�̊�{�I�Ȏg����(�ۑ��A�擾)�ɂ��Đ������܂��B
* �C���[�W�I�͈ȉ��̂悤�ɂȂ�܂��B

![�摜1](/readme-img/OverView.png)

## ����

* Android Studio
* mBaaS��[�A�J�E���g�쐬](http://mb.cloud.nifty.com/signup.htm)

## �菇

* �e���v���[�g�v���W�F�N�g���_�E�����[�h
* SDK��ǉ��i�ς݁E�ŐVSDK�𗘗p�������ꍇ�A�X�V��ƂƂ��čs���Ă��������j
* �A�v���쐬���A�L�[��ݒ�
* ����m�F

## STEP 1. �e���v���[�g�v���W�F�N�g

* �v���W�F�N�g��[Github�y�[�W](https://github.com/ncmbadmin/android_camera_demo.git)����uClone or download�v���uDownload ZIP�v���N���b�N���܂��B
* �v���W�F�N�g���𓀂��܂��B
* AndroidStudio���J���A�𓀂����v���W�F�N�g��I�����܂��B

![�摜2](/readme-img/SelectProject.png)

* �I���v���W�F�N�g���J���܂��B

![�摜3](/readme-img/ProjectDesign.png)


## STEP 2. SDK��ǉ��Ɛݒ� (�ς�)

Android SDK�Ƃ́A�j�t�e�B�N���E�hmobile backend���񋟂��Ă���u�f�[�^�X�g�A�v�u�v�b�V���ʒm�v�Ȃǂ̋@�\���ȒP�܃R�[�h�ŗ��p�ł�����̂ł��B

![�摜4](/readme-img/SdkTypes.png)

mBaaS�ł́AAndroid, iOS, Unity, JavaScript SDK��񋟂��Ă��܂��B
����Android SDK�̒ǉ������Ɛݒ���Љ�܂��B

* �_�E�����[�h�����v���W�F�N�g�ɂ͊��ɐݒ�ς݂ł����A�ŐV�ł͂Ȃ��ꍇ�A�����g�œ���ւ��Ă��������I
* �܂������g�̃v���W�F�N�g�ɂ�SDK��ǉ��������ꍇ�������������K�v�ł��B

* SDK�_�E�����[�h
SDK�͂����iSDK[�����[�X�y�[�W](https://github.com/NIFTYCloud-mbaas/ncmb_android/releases)�j����擾���Ă�������.
  - NCMB.jar�t�@�C�����_�E�����[�h���܂��B
* SDK���C���|�[�g
  - app/libs�t�H���_��NCMB.jar���R�s�[���܂��B
* �ݒ�ǉ�
  - app/build.gradle�t�@�C���Ɉȉ���ǉ����܂��B

```
dependencies {
    compile 'com.google.code.gson:gson:2.3.1'
    compile files('libs/NCMB.jar')
}
```
  - androidManifest�̐ݒ�

<application>�^�O�̒��O�Ɉȉ���permission��ǉ����܂��B

```
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```


## STEP 3. �A�v���L�[�ݒ�

* ����o�^�i�����j�����A�o�^���ł����烍�O�C��������Ɖ��}�̂悤�Ɂu�A�v���̐V�K�쐬�v��ʏo��̂ŃA�v�����쐬���܂��B

![�摜5](/readme-img/mBassNewProject.png)

* �A�v���쐬�����Ɖ��}�̂悤�ȉ�ʂɂȂ�܂��B
* ���̂Q��ނ�API�L�[�i�A�v���P�[�V�����L�[�ƃN���C�A���g�L�[�j�͐�قǃC���|�[�g����AndroidStudio�ō쐬����Android�A�v���Ƀj�t�e�B�N���E�hmobile backend�̕R�t���邽�߁A���ƂŎg���܂��B

![�摜6](/readme-img/mBassAPIkey.png)

* ���̌㓮��m�F�Ńf�[�^���ۑ������ꏊ���m�F���Ă����܂��傤�B

![�摜7](/readme-img/mBassData.png)

* AndroidStudio�Ŏ擾API�L�[(�A�v���P�[�V�����L�[�A�N���C���g�L�[)��ݒ肷��B

![�摜8](/readme-img/AndroidAPIkey.png)

* AndroidStudio����r���h����B
    * �u�v���W�F�N�g�ꏊ�v\app\build\outputs\apk\ ***.apk �t�@�C�������������

## STEP 4. �m�F

* �A�v���ɂă{�^�����^�u���A�摜(����̓t�@�C�����Œ�F`test.png`)�𖳎��B������A�A�v���ɂĎ擾�E�\�����鎖���o���܂��B

![�摜9](/readme-img/AndroidCamera.png)

* mBaaS���̃t�@�C���X�g�A�ɃA�b�v���[�h���ꂽ�摜���m�F�o���܂��B

![�摜10](/readme-img/mBassFileStore.png)


## �R�[�h����

* SDK����ѕK�v�ȃ��C�u�����[���C���|�[�g���܂��B

```java:

import com.nifty.cloud.mb.core.DoneCallback;
import com.nifty.cloud.mb.core.FetchFileCallback;
import com.nifty.cloud.mb.core.NCMB;
import com.nifty.cloud.mb.core.NCMBAcl;
import com.nifty.cloud.mb.core.NCMBException;
import com.nifty.cloud.mb.core.NCMBFile;
```

* SDK��������

 * `MainActivity.java`��OnCreate���\�b�h�Ɏ����A������API�L�[��n���܂��B

```java:

 @Override
    protected void onCreate(Bundle savedInstanceState) {
       <�ȗ�>
        //**************** API�L�[�̐ݒ��SDK�̏����� **********************
        NCMB.initialize(this, "YOUR_APPLICATION_KEY", "YOUR_CLIENT_KEY");
    }
```

�P�j�t�@�C���X�g�A�ւ̃A�b�v���[�h

* mBaaS��Android SDK���񋟂���A�t�@�C���X�g�A�@�\�𗘗p����ꍇ��NCMBFile���g�p���܂��B
* �t�@�C���X�g�A�ւ̃A�b�v���[�h����ɂ́A���̃N���X���񋟂���saveInBackground���\�b�h�𗘗p���܂��B
* saveInBackground()�����{���邱�ƂŁA�񓯊��ɕۑ����s���܂��B�񓯊����{���邽�߁ADoneCallBack()���g���āA�����E���s�������w�肵�܂��B
 - �t�@�C���ۑ��ɐ��������ꍇ�́A�t�@�C���̎擾���s���܂��B(����ۑ������t�@�C�����F`test.png`)
 - �t�@�C���ۑ��Ɏ��s����ꍇ�A�A���[�g�ŕۑ����s��\�����܂��B
* �A�b�v���[�h����t�@�C�������d������ꍇ�́A�V�t�@�C�����㏑���ۑ��ɂȂ�܂��B

�Q�j�A�b�v���[�h�����t�@�C�����擾

* �t�@�C���X�g�A�ɕۑ��������̂��擾����ɂ́Afetch���\�b�h�𗘗p���܂��B
* fetchInBackground���\�b�h�ł̔񓯊��������\�ł��B(���񗘗p)
 - �t�@�C���̎擾���ɂ́A�t�@�C�������Ɏ擾����K�v������܂��B(����ۑ������t�@�C�����F`test.png`)
 - �t�@�C���擾�ɐ��������ꍇ�́A�t�@�C���擾�E�\�����܂��B
 - �t�@�C���擾�Ɏ��s����ꍇ�A�A���[�g�Ŏ��s��\�����܂��B
 
```java:

 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null || data.getExtras() == null) {
            return;
        } else {
            Bitmap bp = (Bitmap) data.getExtras().get("data");
            //******* NCMB file upload *******
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            bp.compress(Bitmap.CompressFormat.PNG, 0, byteArrayStream);
            byte[] dataByte = byteArrayStream.toByteArray();

            //ACL �ǂݍ���:�� , ��������:��
            NCMBAcl acl = new NCMBAcl();
            acl.setPublicReadAccess(true);
            acl.setPublicWriteAccess(true);

            //�ʐM���{
            final NCMBFile file = new NCMBFile("test.png", dataByte, acl);
            file.saveInBackground(new DoneCallback() {
                @Override
                public void done(NCMBException e) {
                    String result;
                    if (e != null) {
                        //�ۑ����s
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Notification from Nifty")
                                .setMessage("Error:" + e.getMessage())
                                .setPositiveButton("OK", null)
                                .show();
                    } else {
                        //******* NCMB file download *******
                        NCMBFile file = new NCMBFile("test.png");
                        file.fetchInBackground(new FetchFileCallback() {
                            @Override
                            public void done(byte[] dataFetch, NCMBException er) {
                                if (er != null) {
                                    //���s����
                                    new AlertDialog.Builder(MainActivity.this)
                                            .setTitle("Notification from Nifty")
                                            .setMessage("Error:" + er.getMessage())
                                            .setPositiveButton("OK", null)
                                            .show();
                                } else {
                                    //��������
                                    Bitmap bMap = BitmapFactory.decodeByteArray(dataFetch, 0, dataFetch.length);
                                    iv.setImageBitmap(bMap);
                                }
                            }
                        });


                    }
                }
            });
        }
    }
```

## �����Ɛ[���m�肽������
* �j�t�e�B�N���E�hmobile backend ��[�h�L�������g�i�t�@�C���X�g�A�iAndroid�j�j](http://mb.cloud.nifty.com/doc/current/filestore/basic_usage_android.html)�����p�ӂ��Ă��܂��̂ŁA�����p���������B

## �Q�l

�T���v���R�[�h���J�X�^�}�C�Y���邱�ƂŁA�l�X�ȋ@�\�������ł��܂��I
�f�[�^�ۑ��E�f�[�^�����E����Ǘ��E�v�b�V���ʒm�Ȃǂ̋@�\�������������ꍇ�ɂ́A
�ȉ��̃h�L�������g�����Q�l���������B

* [�h�L�������g](http://mb.cloud.nifty.com/doc/current/)
* [�h�L�������g�E�f�[�^�X�g�A](http://mb.cloud.nifty.com/doc/current/datastore/basic_usage_android.html)
* [�h�L�������g�E����Ǘ�](http://mb.cloud.nifty.com/doc/current/user/basic_usage_android.html)
* [�h�L�������g�E�v�b�V���ʒm](http://mb.cloud.nifty.com/doc/current/push/basic_usage_android.html)

## �Ō��

�f�[�^��ۑ�������ăT�[�o�𗧂Ă���A�����ŃT�[�o�^�p�Ƃ��A�݌v�Ƃ��A�A�v������T�[�o�[�Ƃ̂��Ƃ���F�X�l�����Ȃ���΂Ȃ�܂���B
�ŒZ���@�Ƃ����̂́A���̂悤��mBaaS�T�[�r�X���g���āA�^�p�A�݌v�Ȃǎ����ł��Ȃ��čςށA�J�������s�R�[�h�����΂����Ƃ����֗��Ȃ��̂͂������ł��傤���H

## Contributing

*    Fork it!
*    Create your feature branch: git checkout -b my-new-feature
*    Commit your changes: git commit -am 'Add some feature'
*    Push to the branch: git push origin my-new-feature
*    Submit a pull request :D

## License

    MIT���C�Z���X
    NIFTY Cloud mobile backend��Android SDK�̃��C�Z���X

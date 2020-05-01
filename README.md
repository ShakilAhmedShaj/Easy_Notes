##Easy Notes - Android App
<p align="center">Note Taking App using Android Jetpack - Room Persistence Library</p>

<img src="https://user-images.githubusercontent.com/15268903/80812278-71bbdf00-8be9-11ea-9cd0-71e1c4231698.png" height="400" width="200"> <img src="https://user-images.githubusercontent.com/15268903/80812282-7385a280-8be9-11ea-8af3-d9ab5770722c.png" height="400" width="200"> <img src="https://user-images.githubusercontent.com/15268903/80812285-741e3900-8be9-11ea-96ca-245aca8f32ec.png" height="400" width="200"> 

### Install the apk

<a href="https://play.google.com/store/apps/details?id=com.t3ch.shaj.easynotes"><img alt="Get it on Google Play" src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" width="185" height="70"/></a>

### Directory Structure

The following is a high level overview of relevant files and folders.

```
└───Easy Notes
    └───app
        └───src
            └───main
                └───java
                    └───com
                        └───t3ch
                            └───shaj
                                └───easynotes
                                    │   LineEditText.java
                                    │   NoteActivity.java
                                    │   NotesListActivity.java
                                    │
                                    ├───adapters
                                    │       NotesRecyclerAdapter.java
                                    │
                                    ├───async
                                    │       DeleteAsyncTask.java
                                    │       InsertAsyncTask.java
                                    │       UpdateAsyncTask.java
                                    │
                                    ├───models
                                    │       Note.java
                                    │
                                    ├───persistence
                                    │       NoteDao.java
                                    │       NoteDatabase.java
                                    │       NoteRepository.java
                                    │
                                    └───util
                                            Utility.java
                                            VerticalSpacingItemDecorator.java
```


## License

The Laravel framework is open-sourced software licensed under the [MIT license](https://opensource.org/licenses/MIT).

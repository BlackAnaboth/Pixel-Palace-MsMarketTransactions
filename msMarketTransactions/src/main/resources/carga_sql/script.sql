INSERT INTO Products (name, description, price, score, image_url, stock, release_date)
VALUES ('Fifa 23', 'Juego de futbol en el año 2023' , 49.99, 4.5, 'https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_801/b_white/f_auto/q_auto/ncom/software/switch/70010000047794/40f9e2f6d344d2607d4be72c6c4ebd3c18717ff87a56d6bbc303c42e58dd570d', 200, '2023-03-23'),
('The Legend of Zelda: Breath of the Wild', 'The Legend of Zelda: Breath of the Wild' , 59.99, 3.7, 'https://upload.wikimedia.org/wikipedia/commons/d/d1/BOTW_%2835018356406%29.jpg', 200, '2017-03-03'),
('Elden Ring','Elden Ring', 59.99, 4.7, 'https://upload.wikimedia.org/wikipedia/commons/f/fd/Elden_Ring_-_Title.png', 200, '2022-02-25'),
('Grand Theft Auto V', 'Grand Theft Auto V', 39.99, 3.0,'https://gmedia.playstation.com/is/image/SIEPDC/GTAV-product-gen9-01-en-3mar22?$1600px$',200, '2013-09-17'),
('Minecraft', 'Minecraft', 26.99, 4.4,'https://image.api.playstation.com/vulcan/img/cfn/11307uYG0CXzRuA9aryByTHYrQLFz-HVQ3VVl7aAysxK15HMpqjkAIcC_R5vdfZt52hAXQNHoYhSuoSq_46_MT_tDBcLu49I.png?w=440&thumb=false',200, '2011-05-19'),
('Super Mario Odyssey', 'Super Mario Odyssey', 59.99, 3.5,'https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_656/b_white/f_auto/q_auto/ncom/software/switch/70010000001130/c42553b4fd0312c31e70ec7468c6c9bccd739f340152925b9600631f2d29f8b5',200, '2017-10-27'),
('Red Dead Redemption 2', 'Red Dead Redemption 2', 39.99, 4.1,'https://upload.wikimedia.org/wikipedia/commons/2/22/Red_Dead_Redemption_2_Logo.png',200, '2018-10-26'),
('Horizon Forbidden West', 'Horizon Forbidden West', 59.99, 4.2,'https://upload.wikimedia.org/wikipedia/commons/7/79/Horizon_Forbidden_West_logo.svg',200, '2022-02-18'),
('God of War', 'God of War', 39.99, 4.4,'https://image.api.playstation.com/vulcan/img/rnd/202010/2217/LsaRVLF2IU2L1FNtu9d3MKLq.jpg?w=440&thumb=false',200, '2018-04-20'),
('The Witcher 3: Wild Hunt', 'The Witcher 3: Wild Hunt', 29.99, 3.0,'https://image.api.playstation.com/vulcan/ap/rnd/202211/0914/TvcIHkYqqln1RGbaFqBeuFp6.jpg?w=440&thumb=false',200, '2015-05-19'),
('Super Smash Bros. Ultimate', 'Super Smash Bros. Ultimate', 59.99, 4.7,'https://upload.wikimedia.org/wikipedia/commons/9/96/Super_Smash_Bros._Ultimate_logo.svg',200, '2018-12-07'),
('Spider-Man', 'Spider-Man', 39.99, 4.3,'https://gmedia.playstation.com/is/image/SIEPDC/marvels-spider-man-desktop-wallpaper-03-en-15dec20?$1600px--t$',200, '2018-09-07'),
('Animal Crossing: New Horizons', 'Animal Crossing: New Horizons', 59.99, 4.1,'https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_656/b_white/f_auto/q_auto/ncom/software/switch/70010000027619/9989957eae3a6b545194c42fec2071675c34aadacd65e6b33fdfe7b3b6a86c3a',200, '2020-03-20'),
('Luigis Mansion 3', 'Luigis Mansion 3', 59.99, 4.3,'https://upload.wikimedia.org/wikipedia/commons/c/c2/Luigi%27s_mansion_3_logo.jpg',200, '2019-10-31'),
('Kirby and the Forgotten Land', 'Kirby and the Forgotten Land', 59.99, 4.0,'https://assets.nintendo.com/image/upload/ar_16:9,c_lpad,w_656/b_white/f_auto/q_auto/ncom/software/switch/70010000046405/a59d040ba1c59da35da603df012d1c18d00a36c55981c8b620cec93b6bfa3576',200, '2022-03-25');


INSERT INTO Categories (name, viewbox, icon)
VALUES
('Action', '0 0 50 50', 'M6.432 21.55a5.17 5.17 0 0 0-.519 2.261l.193 12.125l-4.205 9.024a2.735 2.735 0 0 0-.301.902a2.723 2.723 0 0 0 2.295 3.105a2.724 2.724 0 0 0 2.803-1.386l4.626-9.864c.096-.229.182-.47.217-.734l.025-.372l-.036-7.496l7.109 3.092l1.148 7.326a2.725 2.725 0 0 0 2.259 2.106a2.751 2.751 0 0 0 3.118-2.285c.035-.253.035-.506.011-.746l-1.401-8.844a2.762 2.762 0 0 0-1.534-1.962l-6.354-2.812l4.046-7.014l2.007 2.539c.205.228.471.421.772.541l7.648 2.225a2.154 2.154 0 0 0 2.452-1.286a2.15 2.15 0 0 0-1.183-2.803l-.109-.036l-6.645-1.949l-5.002-5.979a5.071 5.071 0 0 0-2.911-1.541a4.99 4.99 0 0 0-4.972 2.298L6.432 21.55'),
('Adventure', '0 0 100 100', 'M83.117 0c-6.88 0-12.698 4.735-14.379 11.092l-1.851-.86a2.5 2.5 0 0 0-2.108 0L34.166 24.453L3.553 10.233A2.5 2.5 0 0 0 0 12.5v70.287a2.5 2.5 0 0 0 1.447 2.268l31.666 14.709a2.5 2.5 0 0 0 2.108 0l30.613-14.22l30.613 14.22c1.657.769 3.553-.44 3.553-2.266V27.211a2.5 2.5 0 0 0-1.447-2.268l-3.23-1.502l1.011-1.722c.23-.417.413-.861.57-1.315A14.645 14.645 0 0 0 98 14.842C98 6.685 91.298 0 83.117 0'),
('FPS / TPS', '0 0 576 512', 'M528 56c0-13.3-10.7-24-24-24s-24 10.7-24 24v8H32C14.3 64 0 78.3 0 96v112c0 17.7 14.3 32 32 32h10c20.8 0 36.1 19.6 31 39.8L33 440.2c-2.4 9.6-.2 19.7 5.8 27.5S54.1 480 64 480h96c14.7 0 27.5-10 31-24.2L217 352h104.4c23.7 0 44.8-14.9 52.7-37.2l26.8-74.8H432c8.5 0 16.6-3.4 22.6-9.4l22.7-22.6H544c17.7 0 32-14.3 32-32V96zM64 96h384v112H64V96zm128 279.1L135.4 352h96.9l42.6 111.1-12.6-31.5c-2.5-6.3-8.4-10.6-15.2-10.6h-86.2zm237.8 60.5c-2.3 6.6-8.4 11.4-15.6 11.4H367c-7.2 0-13.3-4.8-15.6-11.4l-13.2-37.2h86.2l42.6 111.1 21.3-55.6c6-15.6 21-26.3 38.2-26.3h46.6l-53.7-140.6z'),
('Strategy', '0 0 640 512', 'M0 128v320h128V0H0zm512 0v320h128V0H512zM320 80v352H192V80h128zm256 0v352H448V80h128zM97.83 252.22L176 330.4V181.3L97.83 252.22zM176 448v-97.69l-78.17 68.26L176 448zm160-97.68V448l78.17-97.69L336 350.32zm78.17-97.68L336 181.3v149.1l78.17-68.26z'),
('RPG', '0 0 36 36','M34.52 6.36L28.22 5a3.78 3.78 0 0 0-3.07.67L6.12 19.5l-4.57-.2a1.25 1.25 0 0 0-.83 2.22l4.45 3.53a.55.55 0 0 0 .53.09c1.27-.49 6-3 11.59-6.07l1.12 11.51a.55.55 0 0 0 .9.37l2.5-2.08a.76.76 0 0 0 .26-.45l2.37-13.29c4-2.22 7.82-4.37 10.51-5.89a1.55 1.55 0 0 0-.43-2.88Z'),
('Indie', '0 0 24 24','"M7 6H5V4h2v2m10 0h2V4h-2v2m6 6v6h-2v-4h-2v4h-2v-2H7v2H5v-4H3v4H1v-6h2v-2h2V8h2V6h2v2h6V6h2v2h2v2h2v2h2m-8-2v2h2v-2h-2m-8 2h2v-2H7v2m4 6H7v2h4v-2m6 0h-4v2h4v-2Z'),
('Racing', '0 0 256 256','M221 37a12 12 0 0 0-12.85 1.84c-24.71 21.41-44.53 13.31-74.82-1.68c-28.14-13.89-63.16-31.22-101.19 1.72A12 12 0 0 0 28 48v168a12 12 0 0 0 24 0v-42.29c22.84-17.13 42.1-9.11 70.68 5c16.23 8 34.74 17.2 54.8 17.2c14.72 0 30.28-4.94 46.38-18.88A12 12 0 0 0 228 168V48a12 12 0 0 0-7-11Zm-43.52 38.91A63 63 0 0 0 204 70.08v36.16c-11 8.25-21.2 10.66-32 9.36V75.66c1.81.15 3.64.25 5.48.25ZM148 70.08v38.09c-4.64-2-9.5-4.4-14.68-7A255.21 255.21 0 0 0 108 89.83V51.75c4.64 2 9.5 4.4 14.68 7A252.91 252.91 0 0 0 148 70.08ZM84 44.32v39.92a63.33 63.33 0 0 0-32 5.61V53.68C63 45.42 73.2 43 84 44.32ZM78.52 140A63 63 0 0 0 52 145.86v-28.15c11-8.26 21.2-10.67 32-9.37v31.94c-1.81-.15-3.64-.28-5.48-.28Zm29.48 5.86v-30.09c4.64 2 9.5 4.4 14.68 7A252.91 252.91 0 0 0 148 134.1v30.09c-4.64-2.05-9.5-4.4-14.68-7A250.66 250.66 0 0 0 108 145.86Zm64 25.76v-31.94c1.81.14 3.64.24 5.48.24a62.85 62.85 0 0 0 26.52-5.85v28.19c-11 8.26-21.2 10.66-32 9.36Z'),
('Fighting', '0 0 24 24','m19.8 2l-8.2 6.7l-1.21-1.04L14 5.58L9.41 1L8 2.41l2.74 2.74L5 8.46l-1.19 4.29L6.27 17L8 16l-2.03-3.5l.35-1.32L9.5 13l.5 9h2l.5-10L21 3.4L19.8 2M5 3a2 2 0 1 1 0 4c-1.11 0-2-.89-2-2s.9-2 2-2Z'),
('Sports', '0 0 24 24','M2.05 10.975q.125-1.275.525-2.412t1.1-2.138q.875.9 1.463 2.088t.762 2.462H2.05Zm16.05 0q.175-1.275.75-2.45t1.475-2.075q.7.975 1.1 2.125t.525 2.4H18.1ZM3.675 17.55q-.7-.975-1.1-2.113t-.525-2.412H5.9q-.175 1.275-.763 2.45T3.676 17.55Zm16.65 0q-.9-.9-1.475-2.075t-.75-2.45h3.85q-.125 1.25-.525 2.4t-1.1 2.125Zm-12.4-6.575q-.2-1.8-.975-3.325T4.925 4.9q1.2-1.2 2.738-1.925t3.312-.925v8.925h-3.05Zm5.1 0V2.05q1.775.2 3.313.925T19.075 4.9Q17.8 6.1 17.037 7.638t-.962 3.337h-3.05Zm-2.05 10.975q-1.8-.2-3.325-.937t-2.725-1.938q1.275-1.2 2.038-2.725t.962-3.325h3.05v8.925Zm2.05 0v-8.925h3.05q.2 1.8.963 3.338t2.037 2.737q-1.2 1.2-2.738 1.925t-3.312.925'),
('Hack & Slash', '0 0 512 512','M365.1 21.31c-6.3-.03-12.4.5-16.9 1.4c-4.3.86-6.9 2.81-6.8 2.25c-5.4 9.07-11.1 24.96-12.3 38.47c-.7 6.95-.2 13.21 1.3 17.39c1.5 4.17 3.2 6.1 6.5 7.31c.3.1.4.18.5.25c0-.11.1-.28.4-.55c1.1-.97 3.2-4.03 5.3-8.1c4.1-8.15 7.5-19.78 16.1-28.18c9.2-8.93 21.6-12.1 30.4-16.15c4.4-2.02 7.7-4.15 9.1-5.64c.4-.5.6-.75.8-1.05c-6.2-3.54-19.3-6.95-31.7-7.33v-.02c-.9-.03-1.8-.04-2.7-.05zm-27.7 67.07c-.1.18.1.14 0 0zm72.3-44.28c-3.8 3.39-8.2 5.63-12.6 7.65c-10.4 4.81-21.4 8.86-25.3 12.69c-1.2 1.19-2.6 3.38-4.1 6.13c3.4 3.18 7.5 6.16 12 8.69c10.1 5.62 20.8 7.85 29.1 7.08c8.4-.63 13.6-3.77 16.2-8.32c2.5-4.55 2.3-10.69-1.6-18.1c-2.7-5.4-7.4-11.01-13.7-15.82zm-50.3 43.19c0 .17-.1.33-.2.5c-2.4 4.82-5 9.59-9.4 13.51c-3.4 2.9-8.6 5-13.8 4.8c-7.4 10.2-16 20.9-26.7 32.2c21.9 9.6 38 18.5 57.8 31.9c7.1-27.8 16.3-48.5 25.9-67c-7.3-1.4-14.8-4.2-22-8.19c-4.2-2.3-8.1-4.9-11.6-7.72zm-102 16.91c-24.1 1.1-35.8 11.4-42.4 23.5c-6.6 12-6.6 27-4.9 32c.5 1.8.3 1.3 1 1.4c.7.2 3 .2 6.2-1.3c6.4-3.1 15.3-11.3 20.8-23.5l4.1-9l8.5 4.9c7.4 4.2 17.9.6 22.8-5.5c.5-5.7-1.1-11.5-4.2-15.7c-3.2-4.3-7.3-6.7-11.1-6.8h-.8zm22.4 41.2c-8.3 5.9-19 8.3-29.4 5.7c-2.8 4.8-6 9.1-9.4 12.8c65.4 23.4 80.5 30.9 129.6 69.3c1.1 30.4 4 73.9 1 96.9c-2.4 18.3 17.7 12 18 .2c.4-18.3-3.1-37.9.7-54.7c.8 15.7 14.8 13.5 15.1.3l.7-43.6l6.8-6.3c-63.8-48.1-79.5-59.2-133.1-80.6zm-8.3 48.8l-52.8 95.6l9.2 18.5l-22.5 5.4l-29.5 53.4l10 8.2l21.7-3.7l91.5-165.4c-8.1-4.1-16.9-7.8-27.6-12zm43.5 20.7l-84.5 152.8l37.8-6.4l37.6-68.1l-1-24l17.8-6.3l17.1-30.9c-9.2-6.9-17.1-12.4-24.8-17.1zm-193.1 131L21.17 402.1v15.6l98.63-13.5l23 48.4l-16.2 7.8l-17.4-36.6l-88.03 12V496H391.4l-5.9-10.8l-74-29.3l-55.4 21.7l-6.6-16.8l62-24.3l60.4 23.9l-.8-1.4l-82-82.9l-85.5 14.5l24.4 20.9l-11.8 13.6l-39.9-34.2l-54.4-45z'),
('Platform', '0 0 1025 896','M1024.816 512v320q0 26-19 45t-45 19h-896q-26 0-45-19t-19-45V512q0-26 19-45t45-19q-26 0-45-18.5t-19-45.5V64q0-26 19-45t45-19h896q26 0 45 19t19 45v320q0 27-19 45.5t-45 18.5q27 0 45.5 18.5t18.5 45.5zm-160 256q13 0 22.5-9.5t9.5-22.5t-9.5-22.5t-22.5-9.5t-22.5 9.5t-9.5 22.5t9.5 22.5t22.5 9.5zm-608-112q0-7-4.5-11.5t-11.5-4.5h-48v-48q0-7-4.5-11.5t-11.5-4.5h-32q-7 0-11.5 4.5t-4.5 11.5v48h-48q-7 0-11.5 4.5t-4.5 11.5v32q0 7 4.5 11.5t11.5 4.5h48v48q0 7 4.5 11.5t11.5 4.5h32q7 0 11.5-4.5t4.5-11.5v-48h48q7 0 11.5-4.5t4.5-11.5v-32zm448-560q0-13-9.5-22.5t-22.5-9.5h-320q-13 0-22.5 9.5t-9.5 22.5v256q0 13 9.5 22.5t22.5 9.5h320q13 0 22.5-9.5t9.5-22.5V96zm0 448q0-13-9.5-22.5t-22.5-9.5h-320q-13 0-22.5 9.5t-9.5 22.5v256q0 13 9.5 22.5t22.5 9.5h320q13 0 22.5-9.5t9.5-22.5V544zm96 96q-13 0-22.5 9.5t-9.5 22.5t9.5 22.5t22.5 9.5t22.5-9.5t9.5-22.5t-9.5-22.5t-22.5-9.5zm64-64q-13 0-22.5 9.5t-9.5 22.5t9.5 22.5t22.5 9.5t22.5-9.5t9.5-22.5t-9.5-22.5t-22.5-9.5zm64 64q-13 0-22.5 9.5t-9.5 22.5t9.5 22.5t22.5 9.5t22.5-9.5t9.5-22.5t-9.5-22.5t-22.5-9.5z'),
('Puzzle', '0 0 512 512','M234.72 26.594c-.753-.008-1.514.01-2.282.03c-5.09.147-10.548.97-16.375 2.532c-62.162 16.66-38.924 89.862-13.97 94.72c4.963.964 15.1 29.773 5.407 47.968L102.25 200.03l28.063 104.75c-4.66 18.956-34.61 21.788-51.438 8c-13.04-10.692-68.983 9.403-54.78 62.408c14.2 53.004 76.607 33.183 80.75 11.906c1.016-5.245 28.51-24.732 45.405-7.844l28.125 104.938l114.594-30.72c29.46-14.44 5.724-35.85-14.376-43.437c-15.9-5.987-26.554-64.91 26.844-79.217c5.005-1.342 9.676-1.97 14-2.032c41.79-.61 51.995 53.516 37.062 66.5c-4.135 3.595-13.396 43.19 15.844 36.876l5.312-1.5c-.927.323-1.822.6-2.687.844l118.186-31.656l-30.344-113.313c-14.378-18.138-42.185-4.923-49.687 15c-5.993 15.91-50.688 24.518-65-28.874c-14.312-53.39 32.484-60.992 49.25-47c14.26 11.905 51.205 11.807 40.375-30.47l5.438 18.095l-26.157-97.593l-138.75 37.188c-19.11-8.485-25.912-31.455-10.405-44.438c27.632-23.133 14.2-81.373-33.156-81.843zm137.624 405.562l-3.844 1.094l6.28-1.688c-.837.233-1.653.425-2.436.594zm63.437-243.562a91.447 91.447 0 0 1 1.97 6.562l-1.97-6.562z'),
('Simulation', '0 0 100 100','M83.117 0c-6.88 0-12.698 4.735-14.379 11.092l-1.851-.86a2.5 2.5 0 0 0-2.108 0L34.166 24.453L3.553 10.233A2.5 2.5 0 0 0 0 12.5v70.287a2.5 2.5 0 0 0 1.447 2.268l31.666 14.709a2.5 2.5 0 0 0 2.108 0l30.613-14.22l30.613 14.22c1.657.769 3.553-.44 3.553-2.266V27.211a2.5 2.5 0 0 0-1.447-2.268l-3.23-1.502l1.011-1.722c.23-.417.413-.861.57-1.315A14.645 14.645 0 0 0 98 14.842C98 6.685 91.298 0 83.117 0zm0 6.953c4.405 0 7.908 3.496 7.908 7.889c0 4.392-3.503 7.885-7.908 7.885s-7.908-3.493-7.908-7.885c0-4.393 3.503-7.889 7.908-7.889zm-16.166 8.822l1.377.641a14.726 14.726 0 0 0 2.625 6.938l10.348 17.89c1.45 1.894 2.414 1.534 3.619-.1l7.857-13.373L95 28.805V93.58L67.322 80.723l-.226-39.676c.408.088.815.173 1.224.27l.92-3.891a63.862 63.862 0 0 0-2.168-.473l-.12-21.178zm-2.998.354l.115 20.336a33.73 33.73 0 0 0-3.113-.281l-.148 3.996c1.088.04 2.185.158 3.285.318l.23 40.234l-28.676 13.323l-.369-64.604L63.953 16.13zM5 16.418l27.275 12.67l.371 64.947L5 81.191V16.418zm51.543 20.039c-1.377.247-2.786.688-4.098 1.451a9.932 9.932 0 0 0-3.732 3.82l3.502 1.932a6.003 6.003 0 0 1 2.226-2.289l.006-.004l.006-.004c.807-.47 1.768-.786 2.797-.97l-.707-3.936zm16.666 2.031l-1.133 3.834c2.503.74 4.982 1.59 7.447 2.51l1.399-3.748c-2.532-.944-5.1-1.824-7.713-2.596zm-26.002 7.596l-.03.158l-.003.014c-.499 2.831-.446 5.617-.334 8.265l3.996-.17c-.109-2.569-.132-5.055.277-7.388l.024-.125l-3.93-.754zm3.867 12.21l-3.99.27c.18 2.669.372 5.285.365 7.85l4 .01c.008-2.77-.195-5.478-.375-8.13zm-3.824 11.89c-.11.953-.274 1.88-.514 2.77l-.002.005l-.002.008c-.35 1.335-.939 2.571-1.761 3.539l3.047 2.59c1.288-1.515 2.105-3.298 2.58-5.102l.002-.006c.3-1.116.495-2.24.623-3.35l-3.973-.454zm-33.768 3.898l-1.796 3.574c2.48 1.247 5.045 2.278 7.628 3.17l1.305-3.781c-2.455-.847-4.852-1.815-7.137-2.963zm10.836 4.113l-1.064 3.856c2.646.731 5.366 1.312 8.146 1.625l.446-3.975c-2.521-.283-5.035-.817-7.528-1.506zm18.141.282c-1.992 1.02-4.397 1.397-6.87 1.427l.05 4c2.834-.034 5.864-.444 8.642-1.867l-1.822-3.56z'),
('Arcade', '0 0 48 48','M38.512 9.536A20.429 20.429 0 0 0 24.5 4C13.178 4 4 13.178 4 24.5S13.178 45 24.5 45a20.435 20.435 0 0 0 14.405-5.914L24 24L38.512 9.536Z'),
('MMO', '0 0 512 512','M107.3 26c-4.146 0-8.6 22.976-13.214 42.934l32.187 100.97l-39.052-69.726c-2.932 14.342-5.414 28.62-7.002 42.771l43.176 58.246l-44.838-36.824c-.435 11.08-.15 22.056 1.078 32.897l45.515 36.597l-40.89-13.285c2.558 9.025 5.94 18.077 9.812 27.049l40.819 26.943l-30.065-4.312c13.83 26.954 29.823 52.218 38.697 72.506c2.565 5.13 8.023 16.754 10.926 28.168c3.89 15.695-4.529 35.939-21.271 38.322c12.285-14.291 13.245-23.507 11.02-32.535c-13.242-.192-19.112 15.916-19.112 15.916s-12.527 23.473 15.717 59.369c28.244 35.895 67.176 33.974 67.176 33.974s-2.243-55.044-1.036-79.96c1.22-25.165 8.354-69.758 8.354-69.758s-19.998.093-42.443-15.8c-28.167-19.942-17.51-32.621-24.663-51.077c-14.417-37.201-4.68-95.143-4.68-95.143s-10.858-42.59-17.85-72.822C119.864 76.366 110.398 26 107.3 26zm297.4 0c-3.099 0-12.565 50.366-18.36 75.42c-6.993 30.232-17.852 72.822-17.852 72.822s9.738 57.942-4.68 95.143c-7.152 18.456 3.505 31.135-24.662 51.078c-22.445 15.892-42.443 15.8-42.443 15.8s7.134 44.592 8.354 69.757c1.207 24.916-1.036 79.962-1.036 79.962s38.932 1.92 67.176-33.976s15.717-59.37 15.717-59.37s-5.87-16.107-19.111-15.915c-2.226 9.028-1.266 18.246 11.02 32.537c-16.743-2.383-25.162-22.629-21.272-38.324c2.903-11.414 8.361-23.037 10.926-28.168c8.874-20.288 24.868-45.552 38.699-72.506l-30.067 4.312l40.819-26.943c3.872-8.972 7.254-18.024 9.812-27.049l-40.89 13.285l45.515-36.597c1.228-10.84 1.513-21.817 1.078-32.897l-44.838 36.824l43.176-58.246c-1.588-14.15-4.07-28.429-7.002-42.771l-39.052 69.726l32.187-100.968C413.3 48.978 408.846 26 404.7 26zm-148.702.463c-19.388 0-64.1 45.402-88.344 75.728c-7.017 8.779-15.795 29.823-15.795 29.823l9.194 37.289s-1.154 8.452-2.604 30.49c-1.091 16.591-1.054 32.803-1.054 32.803l52.677-16.893c4.003-22.545 11.506-52.087 20.246-77.21c7.007-20.141 25.68-58.575 25.68-58.575s19.2 36.655 26.072 56.107c9.115 25.801 15.807 57.482 19.856 79.678l52.678 16.893s.036-16.212-1.055-32.803c-1.45-22.038-2.604-30.49-2.604-30.49l9.194-37.29s-6.09-19.371-12.035-27.349c-24.096-32.334-72.718-78.201-92.106-78.201zm.002 77.09s-10.719 28.18-15.37 50.697c-4.299 20.818-11.898 66.635-11.898 66.635s11.983 11.928 5.682 18.256c-6.301 6.328-17.043-5.705-17.043-5.705l-56.435 17.128l3.337 13.217l53.098 19.854s10.656-12.118 17.043-5.703c6.388 6.414-5.682 23.959-5.682 23.959s3.879 16.06 5.995 24.045c3.45 13.022 10.927 38.908 10.927 38.908l10.344 2.867l10.346-2.867s6.8-24.203 10.047-36.346c2.366-8.85 6.875-26.607 6.875-26.607s-12.07-17.545-5.682-23.96c6.388-6.414 17.043 5.704 17.043 5.704l53.098-19.854l3.337-13.217l-56.435-17.128s-10.742 12.033-17.043 5.705c-6.301-6.328 5.682-18.256 5.682-18.256s-7.547-42.316-11.897-65.81C267.12 132.121 256 103.552 256 103.552zm0 136.369c5.02 0 9.088 8.172 9.088 18.254c0 10.081-4.068 18.256-9.088 18.256s-9.09-8.175-9.09-18.256c0-10.082 4.07-18.254 9.09-18.254z'),
('Point & Click', '0 0 512 512','M459.15 269.75a133.197 133.197 0 0 1-55.862 179.975l-42.782 22.541l-10.52 5.533a71.277 71.277 0 0 1-62.966 1.685l-167.077-71.38l15.733-46.676l99.363 19.194l-51.458-97.78l-82.843-157.411l40.357-21.232l82.844 157.457l19.934-10.485l-36.521-69.445l40.335-21.22l36.52 69.445l19.935-10.485l-28.2-53.598l40.358-21.232l28.2 53.598l19.945-10.576l-19.354-36.886l40.346-21.174l19.354 36.885l54.348 103.301zM73.268 146.674a60.03 60.03 0 0 1 42.361-102.459a60.098 60.098 0 0 1 56.58 80.169l10.588 20.013A78.29 78.29 0 0 0 115.708 26a78.233 78.233 0 0 0-5.635 156.262L99.428 162.02a59.688 59.688 0 0 1-26.16-15.346z'),
('Educational', '0 0 24 24','M7 5.6L5.6 7L3.5 4.9l1.4-1.4L7 5.6M10 22c0 .6.4 1 1 1h2c.6 0 1-.4 1-1v-1h-4v1m-9-9h3v-2H1v2M13 1h-2v3h2V1m7 10v2h3v-2h-3m-.9-7.5L17 5.6L18.4 7l2.1-2.1l-1.4-1.4M18 12c0 2.2-1.2 4.2-3 5.2V19c0 .6-.4 1-1 1h-4c-.6 0-1-.4-1-1v-1.8c-1.8-1-3-3-3-5.2c0-3.3 2.7-6 6-6s6 2.7 6 6m-6-4c-1 0-1.91.38-2.61 1h5.22C13.91 8.38 13 8 12 8Z');

INSERT INTO Platforms (name, description)
VALUES ('Xbox Series X', 'Xbox Series X'),
    ('Nintendo', 'Japanese video game company known for its popular franchises such as Mario, Zelda, and Pokémon.'),
    ('PlayStation 5', 'PlayStation 5'),
    ('Switch', 'Switch'),
    ('PC', 'PC'),
    ('Android', 'Android'),
    ('Ios', 'Ios');

INSERT INTO Product_Categories (product_id, category_id)
VALUES (1, 1),
(2,1),
(2,2),
(3,1),
(4,1),
(4,2),
(5,12),
(6,11),
(7,1),
(7,2),
(8,1),
(8,2),
(9,1),
(9,2),
(10,1),
(11,8),
(12,1),
(12,2),
(13,13),
(14,1),
(14,2),
(15,11);

INSERT INTO Product_Platforms (product_id, platform_id)
VALUES (1, 1),
(2,1),
(3,1),
(4,1),
(5,1),
(6,1),
(7,1),
(8,1),
(9,1),
(10,1),
(11,1),
(12,1),
(13,1),
(14,1),
(15,1),
(1,2),
(2,2),
(3,2),
(4,2),
(5,2),
(6,2),
(7,2),
(8,2),
(9,2),
(10,2),
(11,2),
(12,2),
(13,2),
(14,2),
(15,2),
(1,3),
(2,3),
(3,3),
(4,3),
(5,3),
(6,3),
(7,3),
(8,3),
(9,3),
(10,3),
(11,3),
(12,3),
(13,3),
(14,3),
(15,3),
(1,4),
(2,4),
(3,4),
(4,4),
(5,4),
(6,4),
(7,4),
(8,4),
(9,4),
(10,4),
(11,4),
(12,4),
(13,4),
(14,4),
(15,4),
(1,5),
(2,5),
(3,5),
(4,5),
(5,5),
(6,5),
(7,5),
(8,5),
(9,5),
(10,5),
(11,5),
(12,5),
(13,5),
(14,5),
(15,5),
(1,6),
(2,6),
(3,6),
(4,6),
(5,6),
(6,6),
(7,6),
(8,6),
(9,6),
(10,6),
(11,6),
(12,6),
(13,6),
(14,6),
(15,6),
(1,7),
(2,7),
(3,7),
(4,7),
(5,7),
(6,7),
(7,7),
(8,7),
(9,7),
(10,7),
(11,7),
(12,7),
(13,7),
(14,7),
(15,7);

